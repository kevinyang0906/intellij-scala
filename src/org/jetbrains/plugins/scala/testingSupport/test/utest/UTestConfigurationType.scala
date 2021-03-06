package org.jetbrains.plugins.scala
package testingSupport.test.utest

import org.jetbrains.plugins.scala.testingSupport.test.scalatest.ScalaTestRunConfigurationFactory
import com.intellij.execution.configurations.{ConfigurationType, ConfigurationFactory}
import javax.swing.Icon
import org.jetbrains.plugins.scala.icons.Icons

class UTestConfigurationType extends ConfigurationType {
  val confFactory = new UTestRunConfigurationFactory(this)

  def getConfigurationFactories: Array[ConfigurationFactory] = Array[ConfigurationFactory](confFactory)

  def getDisplayName: String = "utest"

  def getConfigurationTypeDescription: String = "utest testing framework run configuration"

  def getId: String = "uTestRunConfiguration" //if you want to change id, change it in Android plugin too

  def getIcon: Icon = Icons.SCALA_TEST

}
