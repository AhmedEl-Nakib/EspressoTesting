package com.example.espressotesting

import org.junit.runner.RunWith
import org.junit.runners.Suite

// use to test many test files together
@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondaryActivityTest::class
)
class ActivityTestSuite