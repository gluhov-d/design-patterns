package com.github.gluhov.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class FlightCollection {
    private final List<Flight> flights;

    public FlightCollection() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public FlightIterator iterator() {
        return new FlightIteratorImpl(this.flights);
    }

    private static class FlightIteratorImpl implements FlightIterator {
        private int index;
        private final List<Flight> flights;

        public FlightIteratorImpl(List<Flight> flights) {
            this.index = 0;
            this.flights = flights;
        }

        @Override
        public boolean hasNext() {
            return index < flights.size();
        }

        @Override
        public Flight next() {
            if (hasNext()) {
                return flights.get(index++);
            }
            return null;
        }
    }
}