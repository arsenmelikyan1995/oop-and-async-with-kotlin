package objectEx

object NetworkConfig : NetworkInfoProvider {
    val baseUrl = "https://<some url>"
    val userAgent = "demo-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"
    }

}