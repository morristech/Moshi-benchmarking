package com.benchmark.model;

import java.util.ArrayList;
import java.util.List;

public class WebProfiles {

  public List<String> qype = new ArrayList<>();
  public List<String> google = new ArrayList<>();
  public List<String> other = new ArrayList<>();
  public List<String> homepage = new ArrayList<>();

  @Override
  public String toString() {
    return "WebProfiles{" +
        "qype=" + qype +
        ", google=" + google +
        ", other=" + other +
        ", homepage=" + homepage +
        '}';
  }
}
