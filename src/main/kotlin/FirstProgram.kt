fun main(args: Array<String>) {
    
    theSampleStringProgram()
    secondCondition()
    theReturnAllStatement()
    returnTheString()
    addTheAllItems()
    setTheCondition()
    isTheLogic()
    ifBlankAndIsNotBlankCondition()
    dataStructure()
    mapAndFilterAndFindConditionInValueOfProgram()
    notEqualCondition()
    isBooleanAndNotEqualFunction()
}

fun theSampleStringProgram() {

    val firstName = "Vijay"

    val secondName = "Bramma Vijay"

    val sampleText = "Android Studio First Program"

    val firstString = firstName.lowercase()

    println("The String Of LowerCase: $firstString")

    println()

    val secondNameString = secondName.uppercase()

    println("The Value Of String of UpperCase:$secondNameString")

    println()

    val joinString = firstString.plus(secondName)

    println("The String Of Joint The Value :$joinString")

    println()

    val startIndex = 0

    val endIndex = 15

    val textSplit = sampleText.substring(startIndex, endIndex)

    println("The Value Of The SubString :$textSplit")

    println()
}


private fun secondCondition() {

    val firstName = "Vijay"

    val secondName = ""

    val listItemOne = listOf<String>("Vijay", "Bala", "Bramma Vijay", "Karthi", "Vijay", "Bala")

    println("The List Item Size: ${listItemOne.size}")

    val listItemTwo = listOf<Int>(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10)


    if (firstName.isNotEmpty()) {

        listItemTwo.map {

            println("The Value Of List Value:$it")
        }
    } else {

        listItemOne.forEach {

            println("The Value If Print The Statement:$it")
        }
    }

    println()

    if (secondName.isEmpty()) {

        listItemTwo.forEach {

            println("The Value Of Print The Statement: $it")
        }

    } else {

        listItemOne.forEach {

            println("The Value Of Condition :$it")
        }
    }

    if (listItemTwo.size < 13) {

        for (element in listItemTwo) {

            println("The Value Of Condition Is 94:$element")
        }

    } else {

        listItemOne.forEach {

            println("The Value Of Constant :$it")
        }
    }
}

private fun theReturnAllStatement() {

    val firstName: String? = null

    if (firstName != null) {

        println("The Value Of First Name: ${firstName.uppercase()}")
    } else {

        println("The Condition Is False")
    }
}

private fun returnTheString(): String {

    val count = 42

    val answerTheString = if (count == 15) {

    } else {

        println("This State Ment Is False")
    }

    return answerTheString.toString()
}

private fun addTheAllItems() {

    val firstName = "Vijay"

    val secondName = ""

    val firstListItem = listOf<String>("Vijay", "Bala", "Kannan", "Hari", "Vijay", "Mani", "Mani")

    if (firstName.isNotEmpty()) {

        val fromIndex = 0

        val endOfIndex = 5

        val firstListItemValue = firstListItem.subList(fromIndex, endOfIndex).distinct()

        println("The Value Of Index of Position: $firstListItemValue")

    } else {

        println("This Condition Is False")
    }
    println()

    if (secondName.isEmpty()) {

        firstListItem.forEach {

            println("The Value Of In All Condition: $it")
        }

    } else {

        println("The Concept Of Value in defined")
    }

    println()

    if (firstName.isEmpty()) {

        val fromIndex = 0

        val lastIndex = 5

        val listOfValueIn = firstListItem.subList(fromIndex, lastIndex).distinct()

        println("The Value Of Index In Action Value:$listOfValueIn")

    } else {

        val fromIndex = 0

        val lastIndex = 5

        val listOfThirdValue = firstListItem.subList(fromIndex, lastIndex).distinct()

        println("The Value Of Index In Action Value:$listOfThirdValue")
    }

    println()

    for (element in firstListItem.indices.distinct()) {

        println("The Value Of Indices In Correct :$element")
    }

    println()
}


private fun setTheCondition() {

    val firstName = "Bramma Vijay"

    val secondName = "Kathir"


    if (firstName.isEmpty()) {

        println("The Name Of Condition Is SatiesFied In :$firstName")

    } else {

        println("The Second Condition Is Correct")
    }

    println()

    if (secondName.isNotEmpty()) {

        println("The Condition is The 222 is Success: $secondName")

    } else {

        println("The Condition is Failure")
    }


}

private fun isTheLogic() {

    val firstName = "Vijay"

    val secondName = "Bala"

    val firstNumber = 12

    val secondNumber = 13

    val thirdNumber = 14

    val isTheFirstList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)


    if (firstName != secondName) {

        println("This First Condition is Success")

    } else {

        println("The Second Condition is Success")
    }

    println()

    if (firstNumber < secondNumber) {

        println("The Number Of Condition Value Is Correct")

    } else {

        println("This Second Condition is SatiesFied")
    }

    println()

    for (element in isTheFirstList) {

        println("The Value Of List In Print:$element")
    }

    isTheFirstList.forEach {

        println("The Number Of ForEach Loop Of :$it")
    }
    println()

    if (firstName.isNotEmpty()) {

        println(" This Concept is True ")

    } else {

        println("This Concept is False")
    }

    println()

    if (thirdNumber < firstNumber) {

        println("This Concept  Of Condition is Failure")

    } else {

        println("This Condition is Success")
    }

    println()

    if (firstName != null && firstName.length > 3) {

        println("This Concept of First Condition is Possible")

    } else {

        println("This Concept Of Second Condition is Possible")
    }

    println()

    if (firstName.isNotEmpty()) {

        println("The Concept Of Condition Name Is Vijay")

    } else {

        println("The Concept is false ")
    }

    println()
    if (firstName.isNotEmpty() || secondName.isEmpty()) {

        println("This Concept is The Value in Available Of Condition")

    } else {

        println(" This Condition is Not SatiesFied")
    }

    println()

    println("The Value Of List Of Any Condition :${isTheFirstList.map { it }}")

    println()

    if (firstName.isBlank()) {

        println("The Condition of 346: $firstName")
    } else {

        println("This Condition Failed")
    }

    println()
}

private fun ifBlankAndIsNotBlankCondition() {

    val userName = "vijay"

    val secondUserName = ""

    val thirdUserName = "Narain"

    val fourthUserName = ""

    val isLoad: Boolean = false

    val isTheFirstList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    if (userName.isBlank()) {

        println("The New One Condition is Success")

    } else {

        println("The New One Condition is Failure")
    }

    println()

    if (secondUserName.isBlank()) {

        println("The New Second Condition is Success")

    } else {

        println("The Second Condition is Failure")
    }
    println()

    if (thirdUserName.isBlank()) {

        println("This Condition is Failed")
    } else {
        println("This Condition is Success")
    }
    println()

    if (fourthUserName.isBlank()) {

        println("This Condition is 397 is Success")

    } else {

        println("This Condition is 401 Sucess")
    }

    println()

    if (userName.isNullOrEmpty()) {

        println("This Condition Is 408 is Success")

    } else {

        println("This Condition is 412 Sucess")
    }

    println()

    if (userName.isNullOrBlank()) {

        println("This Condition is 417 is Success")

    } else {

        println("This Condition is 424 is failed")
    }

    println()

    if (!isLoad) {

        println("The Value Of Enter The Boolean")

    } else {

        println("The Value Of NotSuccess The Value ")
    }

    println()

    isTheFirstList.map {
        it

        println("The Full Of Value In Map:$it")

    }
    println()

    isTheFirstList.forEach { action ->

        if (action.equals(fourthUserName)) {

            println("The Name Of First Name:$action")
        } else {

            println("The Value OF Second Condition:$action")
        }
    }

    println()


}

private fun dataStructure() {

    val isFirstName: String = "Bramma Vijay"

    val isSecondName: String = "Hari"

    val isThirdName: String = "Pavithran"

    val isFourthName: String = ""

    val isLoad: Boolean = false

    val isFirstList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 3, 5, 4)

    val isSecondList = listOf<String>("Java", "python", "kotlin", "Script", "kotlin")


    //String Interpolation
    val isJointOfName = "The Value Of Join Two Name $isFirstName $isSecondName "

    println("The Two Name Of Joint The String :$isJointOfName")

    println()

    //Using The Plus
    val isNameLength = isFirstName.length

    println("The Name Of Length:$isNameLength")

    //Removing White Space
    val isNameSpace = isFirstName.trim()
    println("The Name Of White Space Trim:$isNameSpace")
    println()

    val isTheNameofUpperCase = isFirstName.uppercase()
    println("The Name of UpperCase Value:$isTheNameofUpperCase")
    println()

    val theValueOfSubString = isFirstName.substring(0, 6)
    println("The Value Of Print The SubString Concept:$theValueOfSubString")
    println()

    val theSubListOfConcept = isFirstList.subList(0, 5).distinct()
    println("The Value OF Is The First List:$theSubListOfConcept")
    println()

    val thePrintOfValue = isFirstList.distinct()
    println("The Value of The Concept:$thePrintOfValue")
    println()

    val theConceptOfSublist = isFirstList.subList(0, 13).distinct()
    println("The Value Of SubList Concept:$theConceptOfSublist")
    println()


    if (isFirstName == isFourthName) {

        println("The Value of False")

    } else {

        println("The Value of Correct")
    }

    println()

    if (isThirdName == isFirstName) {

        println("The Name is Correct is Correct")

    } else {

        println("The Name Is Failed")
    }
    println()

    for (element in isFirstList.distinct()) {

        println("The List Of Loop Value:$element")
    }

    println()

    if (isFirstName.length > 6) {

        println("The Value Of Second List :$isSecondList")

    } else {

        println("The Concept of Error Condition")
    }

    println()

    if (isFirstName != isSecondName) {

        val theValueOfSecondList = isFirstList.subList(0, 4).distinct()

        theValueOfSecondList.forEach {

            println("The Concept Of 566 is New:$it")
        }

    } else {

        println("This Condition is Failed")
    }

    if (!isLoad) {

        val isFirstNameValue = isFirstName.substring(0, 6)

        println("The Value Of Concept in SubString Value:$isFirstNameValue")

    } else {

        val isSecondName = isSecondName.substring(0, 2)

        println("The Concept of New Value in SubString Concept:$isSecondName")
    }

    if (isFirstList.size > 16) {

        val isFirstNameValueInCondition = isFirstName.dropLast(5)

        println("This Concept in Drop Condition:$isFirstNameValueInCondition")

    } else {

        val isSecondName = isFirstList.dropLast(3)

        println("This Condition is Working On:$isSecondName")
    }

    println()

    //Nested If else Condition

    if (isFirstList.isNotEmpty()) {

        if (isSecondName.isNotBlank()) {

            val isFirstListOfValue = isFirstList.subList(0, 8).distinct()

            isFirstListOfValue.forEach {

                println("The List Of Value In Condition Is :$it")
            }
        } else {

            val isFirstNameOfValue = isFirstName.substring(0, 6)

            println("The Condition of Value : $isFirstNameOfValue")
        }

    } else {

        if (isFirstList != isSecondList) {

            val isListOfFirst = isFirstList.subList(0, 9)

            isListOfFirst.forEach {

                println("The Concept of Value In Nested Loop:$it")
            }
        } else {

            val theValueOfPoint = isSecondList.size

            println("The Concept of Value in Size:$theValueOfPoint")
        }

        println()

    }
}


private fun mapAndFilterAndFindConditionInValueOfProgram() {

    val isTheFirstList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)

    val isTheSecondList =
        listOf<String>("Java", "Kotlin", "python", "Ml", "DataScience", "Ruby", "Testing", "JavaScript")

    val isTheThirdList = listOf<Any>(1, 2, 3, 4, 5, 6, 7, "python", "kotlin", "Java", "DataBase")

    val isTheNewListValueAdd = isTheFirstList.map { it }.distinct()


    val isTheNewFourthListValue =
        listOf<Any>(1, 2, 3, 3, 2, 1, 4, 5, 6, 5, 4, 3, 6, 3, 2, 7, "Vijay", "BrammaVijay", "Karthi", "Vijay")

    println("The Value Of Mapping Concept:$isTheNewListValueAdd")

    println()

    if (isTheFirstList.size < 12) {

        val isFirstListOfValue = isTheFirstList.subList(0, 8).distinct()

        println("This Condition is Value Of :$isFirstListOfValue")
    } else {

        val isTheSecondListOfValue = isTheSecondList.subList(0, 6)

        isTheSecondListOfValue.forEach {

            println("This Concept Of Value in :$it")
        }
    }
    println()

    if (isTheThirdList.isNotEmpty()) {

        println("The Name Is Vijay")
    } else {
        println("The Name is BrammaVijay")
    }
    println()

    if (isTheThirdList.size > 12) {

        println("The Concept Of is Empty")

    } else {

        println("The Concept is All Of Empty")
    }

    if (isTheThirdList.isNotEmpty()) {

        println("The Name Is Vijay Is True")
    } else {

        println("The Name Is Of false If Vijay")
    }

    if (isTheThirdList.size == 12) {

        println("The Name Is Vijay Second True")
    } else {

        println("The Name Is ")
    }

    if (isTheThirdList.isNotEmpty()) {

        println("This Condition is True 715")
    } else {

        println("The Condition is False 718")
    }

    if (isTheThirdList.isEmpty()) {

        println("The Value Of Contribute is False 723")

    } else {

        println("The Condition is True 727")

        println()
    }

    for (newListItem in isTheFirstList) {

        println("The New List Of Concept In :$newListItem")
        println()
    }

    isTheFirstList.onEach {

        println("The Value of SecondNew List Value :$it")

        println()
    }

    for (isTheOldListValue in isTheNewFourthListValue) {

        println("The New Content Of New Value :$isTheOldListValue")
    }

    for (isTheNewList in isTheNewFourthListValue.distinct()) {

        println("The Value Of New Fourth List Content: $isTheNewList")

        println()
    }

    if (isTheThirdList.isNotEmpty()) {

        println("This Function is First Condition is Blank")

    } else {
        println("This Function is Second Condition is Blank")
    }

    println()

    if (isTheThirdList.isNotEmpty()) {

        for (element in isTheFirstList.distinct()) {

            println("The Value Of Print :$element")
        }
    } else {

        println(" The Empty State")
    }

    println()

    if (isTheFirstList.isEmpty()) {

        for (element in isTheFirstList) {

            println("The Loop Of Condition is First Condition :$isTheFirstList")
        }

    } else if (isTheSecondList.isNotEmpty()) {

        isTheSecondList.forEach {

            println("The ForEach Is The Second Condition:$it")
        }

    } else if (isTheThirdList.isEmpty()) {

        isTheThirdList.onEach {

            println("The OnEach is The Third Condition: $it")
        }
    } else {

        if (isTheNewFourthListValue.isNotEmpty()) {

            for (firstElement in isTheNewFourthListValue.distinct()) {

                println("The Last Condition is SetValue:$firstElement")
            }

        } else {

            println("This Statement is False")
        }
    }
}

private fun notEqualCondition() {

    val firstName = "Vijay"

    val secondName = "Brahma Vijay"

    val thirdName = "Kathi"

    val middleName = "Vijay"

    val finalName = "Bala"

    val userId = "1234"

    val ownUserId = "3451"

    val isFirstListItemOne = listOf<Any>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,1,2,3,4,5)

    val isSecondListItem = listOf<Any>("Vijay", "Mani", "Kathi", "Muthu")

    val isThirdListItem = listOf<Any>(1, 2, 3, 4, 5, 6, 7, "vijay", "Mani", "Ebi", "Velu")

    println()

    if (firstName != secondName) {

        isFirstListItemOne.forEach {

            println("The First Condition :$it")
        }

    } else {

        for (element in isSecondListItem) {

            println("The Second Condition:$element")
        }
    }

    println()

    if (userId != ownUserId) {

        for (element in isFirstListItemOne) {

            println("The Value Of Second Condition :$element")
        }
    } else {

        isThirdListItem.forEach {

            println("The Value Of Second Condition False:$it")
        }
    }

    println()

    if (isFirstListItemOne.size < 12) {

        if (firstName == middleName) {

            isFirstListItemOne.forEach {

                println("The Value Of Condition Is ThirdItem:$it")
            }

        } else {

            println("The Name Of List Value :$isSecondListItem")
        }

    } else {

        if (secondName != finalName) {

            println("The Value Of Third Condition:$isFirstListItemOne")

        } else {

            println("The Value of Third Condition:$isThirdListItem")
        }
    }
    println()

    if (firstName != isFirstListItemOne.size.toString()) {

        println("The Name Of Vijay")
    } else {

        println("The Name of False ")
    }

    println()

    if (firstName == secondName) {

        println("The Condition of Name In New ")

    } else {
        println("The Name Of Value In Statement")
    }

    if (firstName == secondName || finalName == middleName) {

        if (userId != ownUserId) {

            val subListItemValue=isFirstListItemOne.subList(1,8).distinct()

            subListItemValue.forEach {

                println("The Name Of New List Value Of 929:$it")
            }

        } else {
            println("The Condition of False")
        }
    } else {

        if (firstName != middleName && firstName == thirdName) {

            for (element in isFirstListItemOne.subList(1, 6)) {

                println("The Value Of Print Statement Condition :$element")
            }
        } else {

            println("The Statement Is True")
        }
    }

    println()

    if (userId!=ownUserId){

        if (firstName!=secondName){

            val isTheListItem= isSecondListItem.subList(0,2)

            isTheListItem.forEach {

                println("THe List Item OF Value In ForEach 961:$it")
            }
        }else{

            for (element in isThirdListItem.distinct()){

                println("The Main List Item In 967:$element")
            }
        }

    }else{

        if (firstName==middleName){

            val isSecondListItemValue=isThirdListItem.subList(0,8)

            isSecondListItemValue.forEach {

                println("The Value of Print Statement In 979:$it")
            }
        }else{

            val newListItemValue=isFirstListItemOne.distinct()

            for (element in newListItemValue.subList(1,10)){

                println("The New Concept Of 987:$element")
            }
        }

        println()

        if(isFirstListItemOne.isNotEmpty()){

            for (element in isSecondListItem.distinct()){

                println("The Value Of Name The Condition:$element")
            }

        }else{

            isFirstListItemOne.forEach {

                for (element in it.toString()){

                    println("The Value Of 1004 Statement of Condition:$element")
                }
            }
        }

    }

    println()

}


private fun isBooleanAndNotEqualFunction(){

    val isFirstName:String="Vijay"

    val isSecondName:String="Bramma Vijay"

    val isThirdName:String="Vijay"

    val isFourthName:String="Bramma Vijay"

    val isOpen:Boolean=false

    val isOpenOne:Boolean=true

    val isNameListValue= listOf<Any>("Vijay","Ajay","Kathir","Bala","Bala")


    if (isFirstName.isNotEmpty()){

        if (isSecondName.isNullOrEmpty()&&isFourthName.isEmpty()){

            println("This First condition is Added ")

        }else{

            println("The Second Condition is Added ")
        }

    }else{

        if (isFirstName.isEmpty()){

            println("Third Condition is Added")
        }else{

            println("Fourth Condition is Added")
        }
    }

    println()

    if (isOpen){

        println("The First Condition is Boolean:$isOpen")

    }else{

        println("The Second Condition is Boolean:$isOpen")
    }

    if (isFirstName.isEmpty()){

        println("The Data of Id generate in ")

    }else{

        println("The Data Of Value in Condition in Generate Condition")

    }

    if (isFirstName.isNotEmpty() && isThirdName.isNotEmpty()){

        println("The Data Of Value Condition in 1078")

    }else{

        println("The Data of Value in Condition is 1082")
    }

    if (isFirstName!=isFourthName){

        println("The Name of Condition is Declare 1087")

    }else{

        println("The Name of Condition is Declare in 1091")
    }

    if (isFirstName.isNotEmpty()){

        println("The StateOf Condition is Value 1096")

    }else{

        println("The StateOf Condition is Value 1099")
    }

    isNameListValue.forEach { it ->

        it.takeIf {
            it == "vijay"
        }
        println("The Name of Value in :$it")
    }

    println()

    if (isFirstName.isNotEmpty()){

        if (isFirstName==isSecondName){

            println("The Condition of Statement 1115 : $isFirstName")

        }else{

            println("The Second Condition is Statement: $isSecondName")
        }
    }else{

        if (isFirstName!=isFourthName){

            println("This Condition is All 1127 is Statement:$isFourthName")
            
        }else{

        }
    }

}




