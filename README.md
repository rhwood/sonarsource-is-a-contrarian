# Sonarsource Rule S5838 appears Contrarian

[The analysis](https://sonarcloud.io/code?id=rhwood%3Asonarsource.is.a.contrarian&selected=rhwood%3Asonarsource.is.a.contrarian%3Asrc%2Ftest%2Fjava%2Fsonarsource%2Fis%2Fa%2Fcontrarian%2FComparableTest.java) at first appeared contradictory, but is hinting that `Comparable.compareTo(Object)` has special handling using the AssertJ assertions:
- `assertThat("foo").isGreaterThan("bar")`
- `assertThat("bar").isLessThan("foo")`
- `assertThat("foo").isEqualToByComparing("foo")`
