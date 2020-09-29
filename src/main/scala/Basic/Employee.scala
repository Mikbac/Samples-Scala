package Basic

import java.time.LocalDate

/**
 * Created by MikBac on 27.08.2020
 */

class Employee1(name: String,
                surname: String,
                age: Integer,
                salary: BigDecimal,
                startOfWork: LocalDate)

class Employee2(name: String,
                surname: String,
                age: Integer,
                salary: BigDecimal,
                startOfWork: LocalDate) {
  require(name.nonEmpty, "The name cannot be empty")

  def this(surname: String) = this("Name", surname, 12, 1234, LocalDate.now())

  override def toString: String = "{" + name + ',' + surname + ',' + age + "}"
}
