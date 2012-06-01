package demo

class BatchController {
        
    
        
    def index = {

        redirect(action: "config")
    }

    def configFlow = {
    
        
        stepOne {
            on("next") {
                log.debug("JUST HIT next at STEP ONE")
                
                [params:[source:'one']]
            }.to("processOne")

            on("cancel"){
                log.debug("JUST HIT finish at STEP ONE")
            }.to("finish")
        }
        
        processOne {
            
            action {
                if ( params.myVar=='one' ) {
                    
                    myService.serviceMethodTwo()
                    gotoOne()
                }else if ( params.myVar=='two' ) {
                    flow.my='Hello'
                    myService.serviceMethod()
                    gotoTwo()    
                }else {
                    gotoFinish()
                }
            }
            on("gotoOne").to("stepOne")
            on("gotoTwo").to("stepTwo")
            on("gotoFinish").to("finish")
            
        }
        
        stepTwo {
            on("previous") {
                log.debug("JUST HIT previous at STEP TWO")
                log.debug("Flow var:"+flow.my)
                myService.serviceMethod()
            }.to("processOne")
            on("cancel").to("finish")
            on("finish"){
                log.debug("JUST HIT finish at STEP TWO")
                myService.serviceMethod()
            }.to("finish")
        }
        
        
        finish {
            redirect(uri:'http://localhost:8080/Playaround')
        }
    
    
    }
}
