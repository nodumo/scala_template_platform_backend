package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.person

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * Person repository algebra.
 *
 * @author Grumpy Cat (nodumowebdev@gmail.com)
 * @tparam F         Effect
 * @tparam  PersonId PersonId to persist
 * @tparam  Person   Person to persist
 */
trait PersonRepositoryAlgebra[F[_], PersonId <: DomainValue, Person[_] <: DomainAggregate[PersonId]] {

  type PersonAggregate = Person[PersonId]

  def createNewPerson(person: CheckedInvariant[PersonAggregate]): F[PersonAggregate]

  def retrievePersonById(personId: CheckedInvariant[PersonId]): F[Option[PersonAggregate]]

  def updateExistingPerson(person: CheckedInvariant[PersonAggregate]): F[Option[PersonAggregate]]

  def deletePersonById(personId: CheckedInvariant[PersonId]): F[Unit]

}
