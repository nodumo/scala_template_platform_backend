package org.mastermold.platform.infrastructure.repositiories.doobie

final case class JDBConfig private[doobie] (
    driver: String,
    url: String,
    username: String,
    password: String
)
