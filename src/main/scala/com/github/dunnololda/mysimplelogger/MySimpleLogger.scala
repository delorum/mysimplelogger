package com.github.dunnololda.mysimplelogger

import org.slf4j.LoggerFactory

object MySimpleLogger {
   class MySimpleLogger(name:String) {
     private val log = LoggerFactory.getLogger(name)

     def debug(message: => String) {if (log.isDebugEnabled) log.debug(message)}
     def debug(message: => String, t:Throwable) {if (log.isDebugEnabled) log.debug(message, t)}

     def info(message: => String) {if (log.isInfoEnabled) log.info(message)}
     def info(message: => String, t:Throwable) {if (log.isInfoEnabled) log.info(message, t)}

     def warn(message: => String) {if (log.isWarnEnabled) log.warn(message)}
     def warn(message: => String, t:Throwable) {if (log.isWarnEnabled) log.warn(message, t)}

     def error(message: => String) {if (log.isErrorEnabled) log.error(message)}
     def error(message: => String, t:Throwable) {if (log.isErrorEnabled) log.error(message, t)}
   }

   def apply(name:String):MySimpleLogger = new MySimpleLogger(name)
 }
