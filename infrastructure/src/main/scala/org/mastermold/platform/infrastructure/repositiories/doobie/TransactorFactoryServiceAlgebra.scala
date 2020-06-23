package org.mastermold.platform.infrastructure.repositiories.doobie

import org.mastermold.platform.common.softwarepatterns.FactoryServiceAlgebra

trait TransactorFactoryServiceAlgebra[From, To] extends FactoryServiceAlgebra[From, To]
