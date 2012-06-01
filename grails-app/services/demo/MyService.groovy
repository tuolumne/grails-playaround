package demo

class MyService implements Serializable{
    
    static scope = "flow"
    static transactional = false
    
    def myVar
    def counter = 0
    
    def serviceMethod() {
        this.counter++
        log.debug("SERVICE METHOD CALLED ${this.counter} times")
        
    }
    
    def serviceMethodTwo() {
        log.debug("SERVICE METHOD TWO CALLED")
        //String source = flow?.params?.source
         
    }
}
