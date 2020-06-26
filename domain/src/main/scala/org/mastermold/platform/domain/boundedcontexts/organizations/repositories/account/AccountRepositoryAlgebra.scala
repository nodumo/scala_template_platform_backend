package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.account

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * Account repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F          Effect
 * @tparam  AccountId AccountId to persist
 * @tparam  Account   Account to persist
 */
trait AccountRepositoryAlgebra[F[_], AccountId <: DomainValue, Account[_] <: DomainAggregate[AccountId]] {

  type AccountAggregate = Account[AccountId]

  def createNewAccount(account: AccountAggregate): F[AccountAggregate]

  def retrieveAccountById(accountId: AccountId): F[Option[AccountAggregate]]

  def updateExistingAccount(account: AccountId): F[Option[AccountAggregate]]

  def deleteAccountById(accountId: AccountId): F[Unit]

}
