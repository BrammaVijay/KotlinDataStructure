import java.util.concurrent.Flow


fun main(args: Array<String>) {

    isStringValueData()

    isConditionIsProvide()

    isUsingTheFindConcept()

    isUsingTheSecondFindConcept()

    isUsingTheThirdConceptOfFind()

    isUsingTheFindConceptFourthStateInValue()

    isUsingFindTheValuesInUsingOfMapConcept()

    isUsingTheSecondMapFunctionSetInFindKeyWord()

    isUsingTheThirdMapFunctionInSetTheValue()

    isUsingTheKeyWordOfDistinctAndListConcept()

    isNewListAndSubListConceptInState()

    isGreaterThenAndLessThenConditionIsProvided()

    isScopeFunctionSetInScreen()

    isSecondScopeAlsoFunction()

    isAddingTheTwoValues()

    isBooleanValueSetInScreen()

    isSortingLogicAndCondition()

    isConditionCheckTheValue()

    isLoopingConceptInForAndForEach()

    isLogicFun()

    addTheNumber()

    isIndexFun()

    isStarPattenLogic()

    isIndexingTheLogic()

    isBasicLogic()

    isLogicIsIfElse()

    isSetTheAllFunction()

    isIndexStartWith()

    isAlphabetLetter()

    isAllStarPatten()

    isTheNewListValue()

    isLogicalOperator()

    isTheNewListInData()

    isTheLogicOneThatValue()

    isNotEqualAndEqualCondition()
}

private fun isStringValueData() {

    val isFirstName: String = "Bramma Vijay"

    val isSecondName: String = "Kathir"

    val isThirdName: String = " The Value of Name "

    val isFirstFloatValue: String = "8.78"

    val isNumberStringValue: String = "21"

    val isStringName: String = "Is Programmer"

    val isFirstList = arrayOf(1, 2, 3, 4, 5, 6)

    val isArrayFilterValue = isFirstList.sort()

    val theNameIdFilter = isThirdName.trim().lowercase().substring(0, 7)

    val theNameOfCondition = isSecondName.drop(2)

    val theOtherName = isFirstName.dropLast(2)

    val isTrimKeyValue = isThirdName.trim()

    val withOutSpaceCondition = isThirdName.replace("\\s".toRegex(), "")

    val characterFiltering = isThirdName.filterNot { it.isWhitespace() }

    val myStringFloatValue = isFirstFloatValue.toFloat()

    val isNumberStringIsConvert = isNumberStringValue.toInt()

    val containsTheString = isFirstName.contains(isStringName)

    println()

    println("The DropLast Condition is ok Better Then:$theOtherName")

    println()

    println("The Name of First String Condition:$isThirdName")

    println()

    println("The Print The value of Trim:$theNameIdFilter")

    println()

    println("The Message Value of Sort The Function:$isArrayFilterValue")

    println()

    println("The Message of State The Value in Drop Condition:$theNameOfCondition")

    println()

    println("The Trim Key Value in Change The Function:$isTrimKeyValue")

    println()

    println("The Type of WithOt Space in android Logic:$withOutSpaceCondition")

    println()

    println("The FilterNot KeyWord Use to WhiteSpaces:$characterFiltering")

    println()

    println("The Value of String To Float Concept in Value:$myStringFloatValue")

    println()

    println("The Number String The Value is Convert:$isNumberStringIsConvert")

    println()

    println("The Contains The String Value Concept:$containsTheString")

    println()
}


private fun isConditionIsProvide() {

    val isFirstName: String = "Vijay"

    val isSecondName: String = "Bala"

    val isThirdName: String = "Bramma Vijay"

    val isFourthName: String = "Vijay"

    val isMiddleName: String = "Bala"

    if (isFirstName == isFourthName) {

        println("The First Condition is Pass")

    } else {

        println("The Second Condition is Pass")
    }

    println()

    if (isSecondName != isFirstName) {

        println("The Value Of FirstCondition is 118 is Pass")

    } else {

        println("The value Of Second Condition is Pass 122")
    }

    println()

    if (isThirdName != isMiddleName) {

        println("The Value of Condition in Set The 127 is Pass The Value")

    } else {

        println("The Name of Condition in Set The Value in 131 ")
    }

    println()

    if (isFirstName == isFourthName && isSecondName == isMiddleName) {

        println("The Name Is Set In The Value 136 ")

    } else {

        println("The Name Is Set The Value in 139 ")
    }

    println()

    if (isFirstName == isFourthName || isMiddleName == isFourthName) {

        println("The Name Is set In The Value in 151")

    } else {

        println("The Name Is Set in Value in 155")
    }

    println()

    if (isFirstName == isFourthName && isMiddleName == isFourthName) {

        println("The value Of set The Value in 162")

    } else {

        println("The Value Of Set The Value In 166")

    }

    println()

    if (isFirstName.isEmpty()) {

        println("The Print of Set In First Condition in 174")

    } else {

        println("The Print in set of second Condition in 178")

    }

    println()

    if (isSecondName.isNotEmpty()) {

        println("The Print of Set In Then Condition in 186")

    } else {

        println("The Print of Set The Value in condition in 192")

    }

    println()

    if (isMiddleName.isNullOrEmpty()) {

        println("This Name Is isNullOrEmpty set The Function in 200")

    } else {

        println("This Name Is isNotNull The Condition in 204")
    }

    println()

    if (isSecondName.isNotBlank()) {

        println("The Name Is NotBlank The Statement in 212")

    } else {

        println("The Name In Blank Condition is Set 215")

    }

    println()

    if (isFirstName.isNullOrBlank()) {

        println("The Statement is Set The Value in Set The Condition 223")

    } else {

        println("The Statement the condition is Set The Value 227")

    }

    println()

}

//Using The Find Concept in Using
private fun isUsingTheFindConcept() {

    val isNumberOne = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    val isFindTheNumberOfValue = isNumberOne.find { it == 3 }

    println("The Value of Find Any Condition in Value:$isFindTheNumberOfValue")

    println()
}

private fun isUsingTheSecondFindConcept() {

    val isNumberOfValueIsTwo = listOf<Any>("Vijay", "Bala", "Mani", 1, 2, 3, 4, 5, 6)

    val isFindTheSecondValue = isNumberOfValueIsTwo.find { it == isNumberOfValueIsTwo.size }

    println("The Last Value Find The Solution in Condition is Work:$isFindTheSecondValue")

    println()
}

private fun isUsingTheThirdConceptOfFind() {

    val isNumberStateTheValue = listOf<Any>(1, 2, 3, 4, 5, 6, 7)

    val isValueOfStateTheFlow = isNumberStateTheValue.find { it == isNumberStateTheValue.size }

    println("The Using The State Of Value in Condition in State:$isValueOfStateTheFlow")

    println()
}

private fun isUsingTheFindConceptFourthStateInValue() {

    val isNumberStateTheValueInFourth = listOf<Any>("Vijay", "Bala", "Hari", 1, 2, 3, 4, 5, 6)

    val isAllNumberIsCollectInState = isNumberStateTheValueInFourth.size

    println("The New List Size is Important in Work is Defined Size:$isAllNumberIsCollectInState")

    println()

}

private fun isUsingFindTheValuesInUsingOfMapConcept() {

    val isNumberAndNameValueSetInMap = mapOf<Int, String>(1 to "Vijay", 2 to "Bala", 3 to "Kathir", 4 to "Ebi")

    val isAllSecondValueInStateIsWork = isNumberAndNameValueSetInMap.entries.find { it.key == 1 }

    println("The State Of New Value in add The New Find Function set in FindMap :$isAllSecondValueInStateIsWork")

    println()

}

private fun isUsingTheSecondMapFunctionSetInFindKeyWord() {

    val isUsingTheFindKeyWordInSet =
        mapOf<Int, String>(1 to "Java", 2 to "Kotlin", 3 to "Python", 4 to "Testing", 5 to "JavScript")

    val isTheKeySearchFindTheValueIn = isUsingTheFindKeyWordInSet.entries.find { it.key == 5 }

    println("The Value of Set in Function New Add The Find Keyword Concept:$isTheKeySearchFindTheValueIn")

    println()
}

private fun isUsingTheThirdMapFunctionInSetTheValue() {

    val isTheSetOfMapFUnctionInSetTheValue =
        mapOf<Int, Any>(1 to 2, 2 to "Vijay", 3 to "Mani", 5 to "Bala", 4 to "Vijay")

    val isMapOfNewValueSetInFunction = isTheSetOfMapFUnctionInSetTheValue.entries.size

    println("The Map Of NewSize The Value In Entire The Function in Set FindMap Function :$isMapOfNewValueSetInFunction")

    println()

    println("The New Value Of Set The Screen In New Data Of Original Map Value:$isTheSetOfMapFUnctionInSetTheValue")

    println()
}

private fun isUsingTheKeyWordOfDistinctAndListConcept() {

    val isFirstListOfUsingTheValue = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4)

    val isTheSecondList = listOf<Int>(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 21, 22, 22, 23, 23, 10, 12)

    val isUsingTheFirstListValue = isFirstListOfUsingTheValue.distinct()

    println("The New Key And Value is Using The Distinct The Value :$isUsingTheFirstListValue")

    println()

    val isTheNewSubListConceptValue = isTheSecondList.subList(0, 12).distinct()

    println("The New Value Of Statement The Condition of Work The SubList Concept:$isTheNewSubListConceptValue")

    println()
}

private fun isNewListAndSubListConceptInState() {

    val isFirstListDataValue = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 13, 15)

    val isTheNewStateInStateValue = isFirstListDataValue.distinct()

    isTheNewStateInStateValue.forEach {

        println("The New State Of Value in ForEach:$it")

        println()
    }

    if (isFirstListDataValue.size < 12) {

        isTheNewStateInStateValue.forEach {

            println("The First Conditions is Will be Run :$it")

            println()
        }

    } else {

        for (firstElement in isFirstListDataValue) {

            println("The Condition is New State Of Value in Second:$firstElement")

            println()
        }
    }
}

private fun isGreaterThenAndLessThenConditionIsProvided() {

    val isFirstNumber: Int = 12

    val isSecondNumber: Int = 13

    val isThirdNumber: Int = 14

    val isFourthNumber: Int = 15

    val isMiddleNumber: Int = 12

    if (isFirstNumber < isSecondNumber) {

        println("The Greater Then is First Condition is Pass")

    } else {

        println("The Greater Then Is Second Condition is Pass")
    }

    println()

    if (isThirdNumber < isSecondNumber) {

        println("The New State Of The Value is Condition in State 416")

    } else {

        println("The New State Of The Value is Condition in State 420")
    }

    println()

    if (isFourthNumber > isMiddleNumber) {

        println("The New State Of Value in Greater Then Condition is Pass:$427")

    } else {

        println("The New State Of Value in  Greater Then Condition is Pass:430")
    }

    println()

}

private fun isScopeFunctionSetInScreen() {

    val isName: String? = "Vijay"

    val isNameInUpperCase = isName?.let {

        it.uppercase()
    }

    println("The Value of set The Screen in FirstScope Function in Using The Let KeyWord:$isNameInUpperCase")

    println()

    val isSecondName: String? = "Bala"

    val isSecondNameEdit = isSecondName?.let {

        it.lowercase()
    }

    println("The Second Value of Using The Second Let KeyWord:$isSecondNameEdit")

    println()


    val isUsingTheNumberConcept: Int? = 24

    val isFirstNumberConnectTheLet = isUsingTheNumberConcept?.let {

        it * 2
    }

    println("The New Of Number State The Flow And New Let Using The Keyword:$isFirstNumberConnectTheLet")

    println()

    val isTheNewListValue = listOf<Int>(1, 2, 3, 4, 5)

    val isTheNewListOfDataInLet = isTheNewListValue.let {

        it.map { value -> value * 2 }

    }
    println("The New Data Of List Print The Value in Let Key:$isTheNewListOfDataInLet")
}

private fun isSecondScopeAlsoFunction() {

    val isTheFirstListAndValue = mutableListOf<Int>(1, 2, 3, 4)

    val isTheAddNewList = isTheFirstListAndValue.also {

        it.add(5)
        it.add(6)
    }

    println()

    println("The First List The Value:$isTheFirstListAndValue")

    println()

    println("The Second List The Value:$isTheAddNewList")

    println()
}


private fun isAddingTheTwoValues() {

    val a = 24

    val b = 25

    val isAdding = a + b

    val isLessTheValue=a-b

    val isMultiplication=a*b

    val isDivided=a/b

    println("The Adding The Two Value:$isAdding")

    println()

    println("The Minus The Second Value:$isLessTheValue")

    println()

    println("The Value of isMultiplication isCurrent Value:$isMultiplication")

    println()

    println("The Value of isDivided is The Condition:$isDivided")

    println()

}

private fun isBooleanValueSetInScreen() {


    val isFirstOne: Boolean = false

    val isSecondOne: Boolean = true

    val isThirdOne: Boolean = false

    if (isFirstOne) {

        println("The New State Of The Value in Condition is :$isFirstOne")

    } else {

        println("The New State of Second Value in Condition is :$isSecondOne")
    }

    println()

    if (isSecondOne) {

        println("The Second One Condition is Pass 550:$isSecondOne")

    } else {

        println("The Second Two Value is Pass 554 : $isFirstOne")

    }

    println()

    if (isThirdOne) {

        println("The Third One Of Condition is Pass The Value:563")

    } else {

        println("The Third Two of Condition is Pass  The Value :567")
    }

    println()

    if (isFirstOne && isThirdOne){

        println("The State of New Condition in Last Boolean Logic Is Finish")

    }else{

        println("This Condition is Wrong The Statement")
    }

    println()

}


private fun isSortingLogicAndCondition(){

    val isFirstList= listOf<Int>(9,3,5,7,8,5,2)

    val isSortedTheNumbers=isFirstList.sorted()

    println("The Number is Sorted The Condition is First Logic is Sorting:$isSortedTheNumbers")

    println()

    val isSortDescending=isFirstList.sortedDescending()

    println("The Number State is Value and Condition in State The isSortDescending :$isSortDescending")

    println()
}

private fun isConditionCheckTheValue(){

    val isFirstValue:Int=12

    val isFirstName:String="Vijay"

    val isMiddleName:String="Vijay1"

    val isSecondValue:Int=13

    if (isFirstValue!=isSecondValue){

        println("This First Condition is True")

    }else{

        println("This Second Condition is True")

    }

    println()

    if (isFirstName==isMiddleName){

        println("The Name Condition is First is Check")

    }else{

        println("The Name is Condition is Second Is Check")
    }

    println()

    if (isFirstValue!=isSecondValue){

        println("The String Format Change The Function isn New")

    }else{

        println("This Con Condition is Pass The Else Condition ")
    }

    println()
}

private fun isLoopingConceptInForAndForEach(){

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7,8,9,10,12,7,8,9,5,4,3)

    val isSecondList= listOf<Any>("Vijay","Bala","Hari",12,13,12,45,34,45)

    val isThirdList= listOf<Any>(12,13,14,15,16,"Vijay","Bala","Hari",12,13,15,16)

    if (isFirstList!=isSecondList){

        val isNewListPrint=isThirdList.distinct().forEach {

            println("The New Data List Of Value:$it")

            println()
        }

    }else{

        println("This Condition is Not Working")
    }

    println()

    if (isSecondList==isFirstList){

        for (isTheNewElement in isFirstList){

            println("The First List Will Be Pass This Condition Pass:$isThirdList")
        }

    }else{

        for (isNewListValue in isThirdList){

            println("The New List Of Value in Find The Value Of Pass:$isSecondList")
        }
    }

    println()

}

private fun isLogicFun(){

    val isFirstName:String="Bramma Vijay"

    val isSecondName:String="Bala"

    val isThirdName:String="Vijay"

    val isMiddleName:String="Vijay"

    if (isFirstName==isSecondName){

        println("This Name is Condition is Wrong")

    }else{

        println("This Name Is Correct The Condition")
    }

    println()

    if (isThirdName==isMiddleName){

        println("This Condition is Not Working 741")

    }else{

        println("This All Value Pass In ")
    }

    println()

    if (isFirstName!=isMiddleName){

        println("The Name Of Data in 752 is New")

    }else{

        println("The New Is Failure si 756")
    }

    println()
}


private fun  addTheNumber(){

    isAddTheNumber(35,89)

    val isNewOneResult=isAddTheNumber(35,89)

    println("The Adding The New Number Set In:$isNewOneResult")

    println()
}

fun isAddTheNumber(a:Int,b:Int):Int{

    return a+b

    println()
}

private fun isIndexFun(){

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7,8)

    val isSecondList= listOf<Any>("Vijay","bala","Mani")

    val isThirdList= listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    val isIndex=isFirstList.indexOf(3)

    println("The new List Value in Index Find:$isIndex")

    println()

    isSecondList.forEachIndexed { index, any ->

        println("The Value of New ForEach Index:$index and $any")
    }

    println()


    val target=5

    val index=isThirdList.indexOf(target)

    if (index!=-1){

        println("The New State Of The $target nad $index")

    }else{

        println("The Target is Not Found The List:$target")

    }

    println()
}

private fun isNumberOfLogic(){

    val isFirstName="Bramma Vijay"

    val isSecondName="Bala"

    val isThirdName="Mani"

    val isLastName="Kalai"

    if (isFirstName!=isSecondName){

        println("The Name is First condition in 834")

    }else{

        println("The Name is Second Condition in 838")
    }
}

private fun isStarPattenLogic(){

    val isRow=7

    for (isFirstRow in 1..isRow){

        for (isSecondRow in 1..isFirstRow){

            print(" *")
        }
        println()
    }

    println()

    for (isList in 1..isRow){

        for (isLast in 1..isList){

            print(" *")
        }
        println()
    }
}

private fun isIndexingTheLogic(){

    val isFirstListData= listOf<Int>(1,2,3,4,5,6)

    val isFirstNameListData= arrayListOf<String>("Vijay","Bala","Hari","Mani")

    val isFirstIndex=isFirstListData.indexOf(3)

    val isSecondIndex=isFirstListData.lastIndex

    val isThirdIndexValue=isFirstListData.size

    println("The Value Of Current Index Position:$isFirstIndex")

    println()

    println("The Last Index Of data Index Position:$isSecondIndex")

    println()

    println("The List Value Of Index Size:$isThirdIndexValue")

    println()

    val isItemListAdd="Vijay"

    val isIndexFindTheValue=isFirstNameListData.indexOf(isItemListAdd)

    val isMapping=isFirstNameListData.map { it.lowercase() }

    println("The Print The mapping :$isMapping")

    println()

}

private fun isBasicLogic(){

    val isRow=7

    for (isFirstRow in 1..isRow){

        print("*")

        println()
    }
    println()
}

private fun isLogicIsIfElse(){

    var isFirstList= listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14)

    var isSecondList= listOf<Any>("Vijay","Pavithran","Mani","Ebi","Gandhi")

    var isThirdList= listOf<Any>(1,2,3,4,5,6,7,8,9,1,3,4,5)

    if (isFirstList==isSecondList){

        println("This Condition is Failed ")

    }else{

        println("This Condition is Pass ")

        println()
    }

    val isListItemValue=isThirdList.distinct()

    println("The Name is Add The item:$isListItemValue")

}

private fun isSetTheAllFunction(){

    var isFirstName:String="Vijay"

    var isSecondName:String="Hari"

    var isThirdName:String="Bala"

    var isMiddleName:String="Kathie"

    if (isFirstName!=isSecondName){

        if (isFirstName.isEmpty()){

            println("The First Name is Print The Statement:$965")

            println()
        }else{

            println("The Second Condition is True:$969")

            println()
        }
    }else{

        if (isFirstName.isNotEmpty()){

            println("This condition is Failed In Else Condition:976")

            println()

        }else{

            println("This Condition is Failed In else 980")

        }

        println()
    }
}

private fun isIndexStartWith(){

    val isFirstName:String="Vijay"

    val isSecondName:String="Bala"

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7)

    for ((index,value) in isFirstList.withIndex()){

        println("The Value of With Index:$index is $value")

        println()
    }

    if (isFirstName.startsWith("V",ignoreCase = true)){

        println("The Name Is First Condition is True")

        println()

    }else{

        println("The Name Is Second Condition is False")

        println()
    }

    if (isSecondName.contains("B",ignoreCase = true)){

        println("The Second Name Will Be Check is Correct")

    }else{

        println("The Second Name is Will be Wrong")

        println()
    }

}

private fun isAlphabetLetter(){

    val isFirstLetter:Char='a'

    val isSecondLetter:Char='b'

    val isThirdLetter:Char='c'

    val isRow=7

    if (isFirstLetter<isSecondLetter){

        println("The Number Of Letter First is Correct")

        println()

    }else{

        println("The Number of Letter Second is Correct")
    }

    for (isFirstRow in 1..isRow){

        for (isSecondRow in 1..isFirstRow){

            print(" *")
        }

        println()
    }


    for (isFirstRow in 1..isRow){

        for (isSecondRow in 1..isRow){

            print("$isSecondRow")
        }

        println()
    }
}

private fun isAllStarPatten(){

    val isFirstName:String="BrammaVijay"

    val isSecondName:String="Bala"

    for (isFirstRow in 1..5){

        for (isSecondRow in 1..isFirstRow){

            print(" *")
        }

        println()
    }

    println()


    for (isFirstRow in 1..7){

        for (isSecondRow in 1..isFirstRow){

            print("$isFirstRow ")
        }

        println()

    }
    println()

    if (isFirstName.startsWith("B",ignoreCase = true)){

        println("The New Data Will be Pass :$isFirstName")

        println()

    }else{

        println("The New Data that Not match")
    }

    if (isFirstName.contains("ay")){

        println("The New Contains First Condition:$isSecondName")

    }else{

        println("The Will be Not Pass The Condition")
    }

    for (isFirstRow in 1..7){

        for (isSecondRow in 1..isFirstRow){

            print(" *")
        }

        println()

    }
    println()

    for (isFirstRow in 1..7){

        for (isSecondRow in 1..isFirstRow){

            print("$isFirstRow ")
        }

        println()
    }

    println()

    for (isFirstRow in 1..8){

        for (isSecondRow in 1..isFirstRow){

            isFirstRow+1

            print("$isFirstRow ")
        }
        println()
    }

    println()


    var isCounter=1

    for (isFirstRow in 1..9){

        for (isSecondRow in 1..isFirstRow){

            print("$isCounter ")

            isCounter+=1
        }

        println()
    }

    println()
}

private fun isTheNewListValue(){

    val isFirstList= listOf<String>("Vijay","hari","Mani","Bala","Anand","Tamil")

    val isNewListValue= listOf<Any>(1,2,3,4,5,6,1,2,3,4,"Vijay","Bala","Mani","kalai","Tamil","Anand","Vijay")

    val isThirdListValue= listOf<Any>(1,2,3,4,5,6,7,1,2,3,4,5,"Vijay","Bala","Mani","Anand")

    val isFindToTheList= listOf<Int>(1,2,3,4,5,6,7)

    val isTheFindCollapseList= listOf<Int>(2,3,4,2,1,5,4,3,6,7,8,4,5)

    for ((value ,isFirstList) in isFirstList.withIndex() ){

        println("The New Value Of Index In And List Value:$value and $isFirstList")

    }

    println()

    for ((isFirstIndex,isSetOfValue) in isNewListValue.distinct().withIndex()){

        println("The New Of WithIndex Value in Ne Set:$isFirstIndex and $isSetOfValue")
    }

    println()

    for ((isFirstIndex ,isSecondPairName) in isThirdListValue.distinct().subList(0,8).withIndex()){

        println("The New SubList And Value Of KeyPair ThirdCondition:$isFirstIndex and $isSecondPairName")
    }

    println()

    isThirdListValue.distinct().forEachIndexed { index, any ->

        println("The Fourth Condition in New ForEachIndexValue:$index and $any")
    }

    println()


    isFirstList.forEachIndexed { index, s ->

        val isNew=s.first()

        println("The New ForEach Index The Value in Single Element:$index and $isNew")
    }

    println()

    val isNewListIndexValue=isFirstList[0]

    println("The New List Of Index In Print The First Condition:$isNewListIndexValue")

    println()

    val isTheNewListValueFind=isThirdListValue.indexOf(4)

    println("The New Index Super Value in Index Assign:$isTheNewListValueFind")

    println()

    val isTheNewSortingList=isTheFindCollapseList.sorted().distinct()

    println("The New List Value In Sorted The Find New List:$isTheNewSortingList")

    println()

    val isTheNewList=isTheFindCollapseList.asReversed().distinct()

    println("The New List Is Reversed The Value in Calculate:$isTheNewList ")

    println()
}

private fun isLogicalOperator(){

    val isFirst:Int=10

    val isSecond:Int=5

    val isThird:Boolean=true

    val isFourth:Boolean=false

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7,8,2,3,4,5,6,7)

    val isFirstName:String="Bramma Vijay"

    val isSecondName:String="Kotlin Language"

    if (isFirst>isSecond){

        println("The Number of First Concept in Pass 1279")

        println()

    }else{

        println("The Number of Second Concept in Pass 1283")

    }

    for ((isFirstIndex,value) in isFirstList.distinct().withIndex()){

        println("The New Value Of Indexing The Concept:$isFirstIndex and $value")

        println()
    }

    val isFirstCondition=isFirst==isSecond

    val isSecondCondition=isFirst!=isSecond

    val isThirdCondition=isFirst<isSecond

    println("The Equal Logical Condition:$isFirstCondition")

    println()

    println("The Equal Logical Second Condition:$isSecondCondition")

    println()

    if (isThirdCondition){

        println("This Condition is Will Be Corrected")

    }else{

        println("This Condition is Not Correct The Value")

        println()
    }


    if (isFirstName.startsWith("Br")){

        val isFirstNameValue=isFirstName.substring(0,6)

        println("The Name Is Correct The Data In SubString Value:$isFirstNameValue")

        println()

    }else{

        val isSecondNameValue=isSecondName.lowercase().length

        println("The Name Is String The Get Of Value In Pass The Second Condition:$isSecondNameValue")
    }

    if (isFirstName.isNotEmpty()){

        val isFirstListValue=isFirstList[0]

        println("The Name Of First List Value In Condition In:$isFirstListValue")

        println()

    }else{

        val isFirstValueFind=isFirstList.subList(0,9).distinct()

        println("The New Value Of Find The Logic In Condition Are Value:$isFirstValueFind ")

        println()
    }

      isFirstList.distinct().onEachIndexed { index, i ->

        println("The New Value Of OnEachIndexed In Value:$index and $i")

          println()
    }

    val isRow:Int=7

    for (isFirst in 1..isRow){

        for (iSecond in 1..isFirst){

            print("* ")
        }

        println()
    }
    println()

    for (isNewRow in 1..isRow){

        for (isSecondNew in 1..isNewRow){

            print("$isNewRow ")
        }

        println()
    }

    println()

    var isCounter=1

    for (isNewRowOne in 1..isRow){

        for (isNewSecondRow in 1..isNewRowOne){

            print("$isCounter ")

            isCounter+=1
        }

        println()
    }
}

data class PerSonDetail(

    val id:Int,val isName:String,val isAddress:String
)

private fun isTheNewListInData(){

    val isListNewAddDetail=ArrayList<PerSonDetail>()

    val isFirstNewList= listOf<Int>(1,3,4,6,5,4,3,7,8,9)

    println()

    isListNewAddDetail.add(PerSonDetail(1,"Vijay","Nagercoil"))

    isListNewAddDetail.add(PerSonDetail(2,"Anand","Palani"))

    isListNewAddDetail.add(PerSonDetail(3,"Gandhi","ViluPuram"))

    isListNewAddDetail.add((PerSonDetail(4,"Ebi","Trichy")))

    isListNewAddDetail.forEach{

        println("The New List Of Value In Set The ForEach:$it")
    }

    println()


    for (isNewListValue in isListNewAddDetail){

        println("The New Data in ForLoop Concept:$isNewListValue")

    }

    println()

    val isNewValueIsSorted=isFirstNewList.sorted()

    println("The New Value List Of Sorted:${isNewValueIsSorted.distinct()}")

    println()

    val isNewValueListIn=isFirstNewList.asReversed()

    println("The New Value Of Reversed in State Of Logic:$isNewValueListIn")

    println()
}

private fun isTheLogicOneThatValue(){

    val isFirstName:String="Vijay"

    val isSecondName:String="Mani"

    val isThirdName:String="Pavi"

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7,8,1,2,3,4,5)

    val isSecondList= listOf<String>("Vijay","Mani","Saran","Bala","Nethaji")

    val isFirstValue:Int=10

    val isSecondValue:Int=15


    if (isFirstName!=isSecondName ){

        println("The First Condition is Working:1481")

        println()

    }else{

        println("The Second Condition is Working:1485")
    }

    if ((isFirstName == isSecondName).equals(isThirdName)){

        println("The First Condition is Working:1492")

    }else{

        println("The Second Condition is Working:1496")

        println()
    }

    if (isFirstList.distinct().size<2){

        val isNewListData=isFirstList.listIterator()

        println("The New Data is List Iterator:$isNewListData")

    }else{

        val isNewSubList=isFirstList.distinct().subList(0,7)

        for (isRowOfList in isNewSubList){

            println("The Data is New SubList Concept:$isRowOfList")
        }

        println()
    }


    if (isFirstValue<isSecondValue){

        println("The New Statement and Condition is The Correct Value")

        println()
    }else{

        println("The New Statement is Second Condition is Failure")

        println()
    }

    if (isSecondValue<isFirstValue){

        println("This Condition is Required is Value is False")

        println()

    }else{

        println("This Condition is True The Data")

        println()
    }


}

private fun isNotEqualAndEqualCondition(){

    val isFirstName:String="Vijay"

    val isSecondName:String="Bala"

    val isFirstNumber:Int=10

    val isSecondNumber:Int=12

    val isThirdNumber:Int=14

    val isFirstList= listOf<Int>(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8)

    val isNameList= listOf<Any>("vijay","Hari","Bala","Mani","Kiran","Vasa-nth","Muthu","Anand")

    if (isFirstName!=isSecondName){

        println("The New Condition are The Correct The Value: First")

    }else{

        println("The Value Pof Wrong The Statement In Condition :Second")
    }

    if (isFirstNumber<isSecondNumber){

        val isNewLiatValue=isFirstList.distinct().subList(0,9)

        isNewLiatValue.forEach {

            println("The New List Of Each Value In :$it")
        }

        println()

    }else{

        for (isNameRowList in isNameList){

            println("The Name List Value:$isNameRowList")

        }
    }


    if (isFirstName.endsWith("ay",ignoreCase = true)){

        val isFilerByList=isFirstList.first()

        val isFilterSecondList=isFirstList.last()

        println("The New List Is Filter By Value In Search Element:$isFilerByList and $isFilterSecondList")

        println()

        val isSecondFilterList=isFirstList[4]

        val isSecondFilterOne=isNameList[3]

        println("The New Value Of Print The Filter By The Value name element:$isSecondFilterList and $isSecondFilterOne")

        println()

        val isThirdListFilter=isFirstList.elementAt(3)

        val isThirdListFilterOne=isNameList.elementAt(4)

        println("The New value Of Element In Filter The Value Element At:$isThirdListFilter and $isThirdListFilterOne")

        println()


        if (isFirstName!=null){

            println("This Condition Are Locked in New Value Find:Vijay")

        }else{

            println("The New State value in This Condition: Bramma Vijay")

        }

    }else{

        println("This Condition is Wrong The Value")

    }

    if (isFirstNumber<isThirdNumber){

        val isFirstNameTheCondition=isFirstList.getOrNull(4)

        println("The New Statement The Validate The Condition:$isFirstNameTheCondition")

    }else{

         isNameList.getOrElse(4){

            println("The No Such Element Exception :$it")

        }

    }
}

