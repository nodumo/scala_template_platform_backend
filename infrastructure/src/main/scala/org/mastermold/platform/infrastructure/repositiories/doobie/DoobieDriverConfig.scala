package org.mastermold.platform.infrastructure.repositiories.doobie

final case class DoobieDriverConfig private[doobie] (
    driver: String,
    url: String,
    username: String,
    password: String
)
