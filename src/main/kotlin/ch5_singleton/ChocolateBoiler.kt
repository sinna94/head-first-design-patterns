package ch5_singleton

//class ChocolateBoiler private constructor(
//    private var empty: Boolean,
//    private var boiled: Boolean
//) {
//// 간단한 싱글톤
////    companion object {
////        private lateinit var uniqueInstance: ChocolateBoiler
////
////        @Synchronized
////        fun getInstance(): ChocolateBoiler {
////            if (!::uniqueInstance.isInitialized) {
////                uniqueInstance = ChocolateBoiler(true, false)
////            }
////            return uniqueInstance
////        }
////    }
//
//// 처음부터 생성
////    companion object {
////        private val uniqueInstance = ChocolateBoiler(true, false)
////
////        fun getInstance(): ChocolateBoiler {
////            return uniqueInstance
////        }
////    }
//
//// DCL 사용
//    companion object {
//        @Volatile
//        private var uniqueInstance: ChocolateBoiler? = null
//
//        fun getInstance(): ChocolateBoiler {
//            if (uniqueInstance == null) {
//                synchronized(this) {
//                    if (uniqueInstance == null) {
//                        uniqueInstance = ChocolateBoiler(true, false)
//                    }
//                }
//            }
//            return uniqueInstance!!
//        }
//    }
//
//    fun fill() {
//        if (isEmpty()) {
//            empty = false
//            boiled = false
//            // 보일러에 우유/초콜릿 혼합재료를 집어넣음
//        }
//    }
//
//    fun drain() {
//        if (!isEmpty() && isBoiled()) {
//            // 끓인 재료를 다음 단계로 넘김
//            empty = true
//        }
//    }
//
//    fun boil() {
//        if (!isEmpty() && !isBoiled()) {
//            // 재료를 끓임
//            boiled = true
//        }
//    }
//
//    private fun isEmpty(): Boolean {
//        return empty
//    }
//
//    private fun isBoiled(): Boolean {
//        return boiled
//    }
//}

object ChocolateBoiler {
    private var empty: Boolean = true
    private var boiled: Boolean = false

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
            // 보일러에 우유/초콜릿 혼합재료를 집어넣음
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            // 끓인 재료를 다음 단계로 넘김
            empty = true
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            // 재료를 끓임
            boiled = true
        }
    }

    private fun isEmpty(): Boolean {
        return empty
    }

    private fun isBoiled(): Boolean {
        return boiled
    }
}