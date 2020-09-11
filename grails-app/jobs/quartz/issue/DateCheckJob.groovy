package quartz.issue

class DateCheckJob {
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        // execute job
	    println new Date()
    }
}
