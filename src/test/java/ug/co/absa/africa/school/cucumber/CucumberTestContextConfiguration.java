package ug.co.absa.africa.school.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import ug.co.absa.africa.school.IntegrationTest;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
