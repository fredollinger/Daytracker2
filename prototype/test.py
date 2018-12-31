#!/usr/bin/env python3

import calendar
import time

secondsPerDay = 60 * 60 * 24    

def calculateDaysPerSecond(sec):
    return int(secondsPerDay * Day)

def calculateDaysElapsed(initTime):
    # secondsPerDay = 60 * 60 * 24    
    currTime = calendar.timegm(time.gmtime())
    return int((currTime - initTime) / secondsPerDay)

def saveInitialTime():
    pass

def loadInitialTime():
    return 1546022333

initTime = 1546022333
print(calculateDaysElapsed(initTime))
