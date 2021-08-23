object CityPopulation extends App {
  /**
   * getCityYear
   * @param p0 - original City population
   * @param percentage - yearly growth rate in percentages
   * @param delta - how many people immigrate(+)/emigrate to the city each year
   * @param targetPopulation - population we want to reach
   * @return number of years to reach , -1 if not reachable
   */
  def getCityYear(p0 : Int, percentage : Double, delta : Int, targetPopulation : Int) : Int = {
    var year = -1
    var population = p0.toDouble
    if (p0 + p0 * percentage / 100 + delta > p0){
      year = 0
      while(population < targetPopulation){
        population = population + population * percentage / 100 + delta
        year = year + 1
      }
    }
    year
  }
  // tests:
  println(getCityYear(1000,2,50,1200)) // should print 3
  println(getCityYear(1000,2,-50,1200)) // should print -1
  println(getCityYear(1500000,2.5,10000,2000000)) // should print 10
}
