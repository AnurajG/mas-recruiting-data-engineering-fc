package com.bosch.test

import org.apache.spark.sql.DataFrame

/**
  * Created by Judy
  */

object FilterCol {
  implicit def filter(df: DataFrame) = new filterImplicit(df)
}

class filterImplicit(df: DataFrame) extends Serializable {

  def filterColumns(): DataFrame = {
    df
  }

}