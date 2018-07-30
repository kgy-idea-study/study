import math

#根据温度和湿度计算体感温度

def calc_heat_index(T, RH):
    '''NOAA计算体感温度 参数为气温(摄氏度)和相对湿度(0~100或者0~1)'''
    if RH < 1:
        RH *= 100
    T = 1.8 * T + 32
    HI = 0.5 * (T + 61 + (T - 68) * 1.2 + RH * 0.094)
    if HI >= 80:  # 如果不小于 80华氏度 则用完整公式重新计算
        HI = -42.379 + 2.04901523 * T + 10.14333127 * RH - .22475541 * T * RH \
             - .00683783 * T * T - .05481717 * RH * RH + .00122874 * T * T * RH \
             + .00085282 * T * RH * RH - .00000199 * T * T * RH * RH
        if RH < 13 and 80 < T < 112:
            ADJUSTMENT = (13 - RH) / 4 * math.sqrt((17 - abs(T - 95)) / 17)
            HI -= ADJUSTMENT
        elif RH > 85 and 80 < T < 87:
            ADJUSTMENT = (RH - 85) * (87 - T) / 50
            HI += ADJUSTMENT
    return round((HI - 32) / 1.8, 2)

print(calc_heat_index(29,74));