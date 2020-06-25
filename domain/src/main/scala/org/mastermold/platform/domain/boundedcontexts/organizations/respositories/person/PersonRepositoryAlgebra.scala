package org.mastermold.platform.domain.boundedcontexts.organizations.respositories.person

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * PersonId repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F         Effect 
  * @tparam  PersonId PersonId to persist  
  * @tparam  Person   Person id to persist 
  */
trait PersonRepositoryAlgebra[F[_], PersonId <: DomainValue, Person[_] <: DomainAggregate[PersonId]] {

  def createNewPerson(person: Person): F[Person]

  def retrievePersonById(personId: Person): F[Option[Person]]

  def updateExistingPerson(person: Person): F[Option[Person]]

  def deletePersonById(personId: PersonId): F[Unit]

}
 