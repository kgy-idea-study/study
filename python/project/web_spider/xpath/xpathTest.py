html_doc ="""
<html>
    <head></head>
    <body>
        <li>
            <a href="/book_16860.html" title="总裁的新鲜小妻">
                <img src="/16860s.jpg">
            </a>
            <img src="/kukuku/images/only.png" class="topss png_bg">
                <img src="abc.png" class="topss png_bg">
            <a href="/book_16860.html">总裁的新鲜小妻子</a>
        </li>
        <li>
            <a href="/book_16861.html" title="斗神天下">
                <img src="/16861s.jpg">
            </a>
            <img src="/kukuku/images/only.png" class="topss png_bg">
            <img src="def.png" class="topss png_bg">
            <a href="/book_16861.html">斗神天下</a>
        </li>

    </body>
</html>"""


from lxml import etree

page = etree.HTML(html_doc)
print(page.xpath('head'))
print(page.xpath('li'))
print(page.xpath('/html'))
print(page.xpath('/li'))
print(page.xpath('//li'))
print(page.xpath('//li')[0].xpath('..'))
print(page.xpath('//a')[1].xpath('@href'))

print(page.xpath('//li[1]/a[1]/img[1]/@src'))

