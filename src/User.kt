class User(
    private var userId:Int, private var userName:String,
    private var userAccountNum:String,
    private var userAddress:String="",
    private var userPhoneNum:Long=0,
    private var accountType:Account) {

    override fun toString(): String {
        return "userId: $userId userName: $userName userAccountNum: $userAccountNum" +
                "userAddress: $userAddress userPhoneNum: $userPhoneNum accountType: $accountType"
    }
}