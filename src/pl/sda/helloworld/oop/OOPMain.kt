package pl.sda.helloworld.oop

import com.sun.xml.internal.fastinfoset.util.StringArray

class Main {

        companion object {
            fun main(args: StringArray) {
                val engine = getEngine()
                if(engine is TruckEngine) {
                    println(engine.doTruckyThing())
                }
            }

            fun getEngine(type: String = "") : Engine = TruckEngine(false)

        }
}
