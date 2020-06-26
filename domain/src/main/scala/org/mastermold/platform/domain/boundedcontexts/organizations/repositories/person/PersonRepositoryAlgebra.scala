package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.person

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * Person repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F         Effect
 * @tparam  PersonId PersonId to persist
 * @tparam  Person   Person id to persist
 */
trait PersonRepositoryAlgebra[F[_], PersonId <: DomainValue, Person[_] <: DomainAggregate[PersonId]] {

  type PersonAggregate = Person[PersonId]

  def createNewPerson(person: PersonAggregate): F[PersonAggregate]

  def retrievePersonById(personId: PersonId): F[Option[PersonAggregate]]

  def updateExistingPerson(person: PersonAggregate): F[Option[PersonAggregate]]

  def deletePersonById(personId: PersonId): F[Unit]

}
