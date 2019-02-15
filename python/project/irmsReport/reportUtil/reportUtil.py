import json
from reportUtil.xmlUtil import *

def createReportXml(config,outfile):
    #f = open("config.json", encoding='utf-8')  # 设置以utf-8解码模式读取文件，encoding参数必须设置，否则默认以gbk模式读取文件，当文件中包含中文时，会报错
    f = open(config, encoding='utf-8')  # 设置以utf-8解码模式读取文件，encoding参数必须设置，否则默认以gbk模式读取文件，当文件中包含中文时，会报错
    setting = json.load(f)

    # 1. 读取xml文件
    tree = read_xml(r"E:\workspace\IDEA\study\python\project\irmsReport\reportUtil\template.xml")

    # 2. 属性修改
    Description = setting['Description']
    name = setting['name']
    change_node_properties(find_nodes(tree, "MODULES/MODULE"), {"id": Description})
    change_node_properties(find_nodes(tree, "TITLE"), {"name": Description})
    change_node_properties(find_nodes(tree, "REPORT/CONTROLS/GRID"), {"Description": Description, "module_id": Description})
    change_node_properties(find_nodes(tree, "REPORT/CONTROLS/GRID"), {"name": name})

    change_node_text(find_nodes(tree, "MODULES/MODULE"), setting['sql'])

    itemList = ''
    for i in range(0,len(setting['COLUMNS'])):
        itemList += setting['COLUMNS'][i]["name"] + ','
        a = create_node("COLUMN", {"Description":setting['COLUMNS'][i]["name"],"columnName":setting['COLUMNS'][i]["id"]}, "")
        add_child_node(find_nodes(tree, "MODULES/MODULE"), a)

        b = create_node("COLUMN", {"Description":setting['COLUMNS'][i]["Description"],"name":setting['COLUMNS'][i]["name"]}, "")
        if len(setting['COLUMNS'][i]["parent"]) != 0:
            if not get_node_by_keyvalue(find_nodes(tree, "REPORT/CONTROLS/GRID/COLUMN"), {"name":setting['COLUMNS'][i]["parent"]}) :
                c = create_node("COLUMN", {"name":setting['COLUMNS'][i]["parent"]}, "")
                add_child_node(find_nodes(tree, "REPORT/CONTROLS/GRID"), c)
            add_child_node(get_node_by_keyvalue(find_nodes(tree, "REPORT/CONTROLS/GRID/COLUMN"), {"name":setting['COLUMNS'][i]["parent"]}), b)
        else:
            add_child_node(find_nodes(tree, "REPORT/CONTROLS/GRID"), b)
    change_node_properties(find_nodes(tree, "REPORT/CONTROLS/GRID"), {"itemList": itemList.strip(',')})

    # 6. 输出到结果文件
    root = tree.getroot()                  #得到根元素，Element类
    prettyXml(root, '\t', '\n')            #执行美化方法

    write_xml(tree, outfile)
    print("创建文件完成")

if __name__ == "__main__":
    createReportXml("config.json","hehe.xml")