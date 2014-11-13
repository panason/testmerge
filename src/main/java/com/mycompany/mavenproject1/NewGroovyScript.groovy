/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1

import java.util.regex.Matcher

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package ru.gosuslugi.epgu
//def scriptName='groovy.fnsFetchBill'
//def filePath='/home/apanasovich/project/git/epgu-beta/epgu/epgu/src/main/groovy/ru/gosuslugi/epgu/sf/processor/impl/FNSFetchBill.groovy'

//def scriptName='groovy.gibddFetchBill'
//def filePath='/home/apanasovich/project/git/epgu-beta/epgu/epgu/src/main/groovy/ru/gosuslugi/epgu/sf/processor/impl/GibddFetchBill.groovy'


//def scriptName='groovy.fnsFetchINN'
//def filePath='/home/apanasovich/project/git/epgu-beta/epgu/epgu/src/main/groovy/ru/gosuslugi/epgu/sf/processor/impl/FNSFetchINN.groovy'


//[2014-10-31 03:42:27,294] [DEBUG] [http-bio-3010-exec-78] [invoke-time-logger] invoke OrderQueryService.listDraftsV2. time 48 ms.
//[2014-10-31 03:42:28,906] [DEBUG] [http-bio-3010-exec-20] [invoke-method-logger] invoke OrderUpdateService.deleteOrder. time 19 ms. code line: ru.atc.carcass.common.json.gateway.GatewayController.invoke(GatewayController.java:112)
//[2014-10-31 03:42:28,906] [DEBUG] [http-bio-3010-exec-20] [invoke-time-logger] invoke OrderUpdateService.deleteOrder. time 19 ms.
//[2014-10-31 03:42:29,611] [DEBUG] [http-bio-3010-exec-78] [invoke-method-logger] invoke ServiceRegistryV2.getServiceFormInfo. time 17 ms. code line: ru.atc.carcass.common.json.gateway.GatewayController.invoke(GatewayController.java:112)
//[2014-10-31 03:42:29,611] [DEBUG] [http-bio-3010-exec-78] [invoke-time-logger] invoke ServiceRegistryV2.getServiceFormInfo. time 17 ms.
//[2014-10-31 03:42:29,770] [DEBUG] [http-bio-3010-exec-76] [invoke-method-logger] invoke ServiceRegistryV2.getServiceFormInfo. time 175 ms. code line: ru.gosuslugi.epgu.sf.service.impl.FGProcessingServiceImpl.getServiceInfo(FGProcessingServiceImpl.java:1690)
//[2014-10-31 03:42:29,770] [DEBUG] [http-bio-3010-exec-76] [invoke-time-logger] invoke ServiceRegistryV2.getServiceFormInfo. time 175 ms.
//[2014-10-31 03:42:29,865] [DEBUG] [http-bio-3010-exec-76] [invoke-method-logger] invoke OrderUpdateService.createOrder. time 94 ms. code line: ru.gosuslugi.epgu.sf.service.impl.FGProcessingServiceImpl.createOrder(FGProcessingServiceImpl.java:1729)
//[2014-10-31 03:42:29,865] [DEBUG] [http-bio-3010-exec-76] [invoke-time-logger] invoke OrderUpdateService.createOrder. time 94 ms.
//[2014-10-31 03:42:29,969] [DEBUG] [http-bio-3010-exec-76] [invoke-method-logger] invoke DraftsService.getDraftByExtId. time 12 ms. code line: ru.gosuslugi.epgu.sf.service.impl.FGProcessingServiceImpl.findOrCreateDraft(FGProcessingServiceImpl.java:1661)
//[2014-10-31 03:42:29,969] [DEBUG] [http-bio-3010-exec-76] [invoke-time-logger] invoke DraftsService.getDraftByExtId. time 12 ms.

def filePath='/home/apanasovich/tmp/log.txt'
File inputFile = new File(filePath)

File outputFile = new File("log.csv")
outputFile <<'sss'


 inputFile.eachLine { line -> 
     
//def matcher = line =~ /\[invoke-method-logger\] invoke (\w+\.\w+)\. time (\d+) ms\. code line\: (.+)/ 
String regexp="\\[invoke-method-logger\\] invoke (\\w+\\.\\w+)\\. time (\\d+) ms\\. code line\\: (.+)"
    Matcher matcher = line  =~ regexp;
    
    println line;
    println matcher.matches()
//	if (matcher.matches())
//	outputFile << matcher[0][1]+", "+matcher[0][2]
    
}
