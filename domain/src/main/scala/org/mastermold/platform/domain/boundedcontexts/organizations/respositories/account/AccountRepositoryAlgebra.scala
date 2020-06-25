package org.mastermold.platform.domain.boundedcontexts.organizations.respositories.account

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * AccountId repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F          Effect 
  * @tparam  AccountId AccountId to persist  
  * @tparam  Account   Account id to persist 
  */
trait AccountRepositoryAlgebra[F[_], AccountId <: DomainValue, Account[_] <: DomainAggregate[AccountId]] {

  def createNewAccount(account: Account): F[Account]

  def retrieveAccountById(accountId: Account): F[Option[Account]]

  def updateExistingAccount(account: Account): F[Option[Account]]

  def deleteAccountById(accountId: AccountId): F[Unit]

}
 