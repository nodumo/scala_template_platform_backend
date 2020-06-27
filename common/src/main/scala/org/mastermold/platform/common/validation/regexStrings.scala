package org.mastermold.platform.common.validation

import scala.util.matching.Regex

object regexStrings {
  
  // --- Alpha

  private[validation] val alpha: Regex                       = "^[a-zA-Z]*$".r
  private[validation] val alphaNumeric: Regex                = "^[a-zA-Z0-9]*$".r
  private[validation] val alphaNumericAllowUnderscore: Regex = "^[a-zA-Z0-9_]*$".r

  // --- Application

  private[validation] val applicationUsername: Regex    = "^[A-Za-z0-9]+(?:[ _-][A-Za-z0-9]+)*$/".r
  private[validation] val applicationPassword: Regex    = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$".r
  private[validation] val applicationEntityTitle: Regex = "^\\w++(?:[.,_:()\\s-](?![.\\s-])|\\w++)*$".r
  private[validation] val contentEmpty: Regex           = "^$".r
  private[validation] val contentNotEmpty: Regex        = "^(?!\\s*$).+".r

  // --- Date

  private[validation] val dateFormatDDMMYYYY: Regex =
    "^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$".r
  private[validation] val dateTimeFormatYYYYMMDDHHMISS: Regex = "".r

  // --- Credit card numbers

  private[validation] val creditCardMasterAmexNumber: Regex = "^3[47][0-9]{13}$".r
  private[validation] val creditCardDiscoverCardNumber: Regex =
    "^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})$".r
  private[validation] val creditCardMasterCardNumber: Regex =
    "^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))$".r
  private[validation] val creditCardVisaNumber: Regex           = "^4[0-9]{12}(?:[0-9]{3})?$".r
  private[validation] val creditCardVisaMasterCardNumber: Regex = "^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14})$".r
  private[validation] val creditCardUnionPayCardCode: Regex     = "^(62[0-9]{14,17})$".r
  private[validation] val creditCardSecurityCode: Regex         = "[0-9]{3}".r
  private[validation] val creditCardExpiryMonthSlashYear: Regex = "".r

  // --- Java

  private[validation] val javaLiteralFloat: Regex = "[+-]?([0-9]*[.])?[0-9]+".r
  private[validation] val javaLiteralInt: Regex   = "^[-+]?\\d+$".r
  private[validation] val javaLiteralLong: Regex  = "^-?\\d{1,19}$".r
  private[validation] val javaJDBCURL: Regex      = null

  // --- Misc.

  private[validation] val personName: Regex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$".r

  private[validation] val phoneNumber7DigitDecimals: Regex = "[0-9]{7}".r
  private[validation] val phoneNumber9DigitDecimals: Regex = "[0-9]{9}".r

  private[validation] val postalAmericanPostalCode: Regex = "^\\d{5}$".r
  private[validation] val postalCanadianPostalCode: Regex = "^([A-Za-z]\\d[A-Za-z][-]?\\d[A-Za-z]\\d)".r

  private[validation] val networkIPV6: Regex = "([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}|(\\d{1,3}\\.){3}\\d{1,3}".r
  private[validation] val networkWebsite: Regex =
    "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$".r
}
