#!/usr/bin/env python3

import calendar
import time

secondsPerDay = 60 * 60 * 24    

class DTDate:
    def __init__(self):
        self.loadInitialTime()
        pass

    def calculateDaysPerSecond(sec):
        return int(secondsPerDay * Day)
    
    def calculateDaysElapsed(self):
        currTime = calendar.timegm(time.gmtime())
        return int((currTime - self.initTime) / secondsPerDay)
    
    def saveInitialTime(self):
        pass
    
    def loadInitialTime(self):
        self.initTime = 1546022333
    
    def resetInitialTime(self):
        self.initTime = calendar.timegm(time.gmtime())

d = DTDate()
d.loadInitialTime()
#d.resetInitialTime()

print(d.calculateDaysElapsed())

    
#initTime = 1546022333
