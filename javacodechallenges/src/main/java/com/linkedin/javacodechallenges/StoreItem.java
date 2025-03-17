package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
  String name;
  double retailPrice;
  double discount;

  public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {
    // TODO: Implement
    Optional<StoreItem> minItem = items.stream().min( (item1,item2) -> Double.compare(item1.retailPrice - (item1.retailPrice* item1.discount), 
                                                        item2.retailPrice - (item2.retailPrice* item2.discount) ));
    return minItem;
  }

  @Override
  public String toString() {
    return "Name: " + name + ", " + "Retail price: " + retailPrice + ", " + "Discount " + discount;
  }
}