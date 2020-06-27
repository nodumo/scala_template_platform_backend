package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.account

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * Account repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F         Effect
 * @tparam AccountId AccountId to persist
 * @tparam Account   Account to persist
 */
trait AccountRepositoryAlgebra[F[_], AccountId <: DomainValue, Account[_] <: DomainAggregate[AccountId]] {

  type AccountAggregate = Account[AccountId]

  def createNewAccount(account: CheckedInvariant[AccountAggregate]): F[AccountAggregate]

  def retrieveAccountById(accountId: CheckedInvariant[AccountId]): F[Option[AccountAggregate]]

  def updateExistingAccount(account: CheckedInvariant[AccountAggregate]): F[Option[AccountAggregate]]

  def deleteAccountById(accountId: CheckedInvariant[AccountId]): F[Unit]

}
