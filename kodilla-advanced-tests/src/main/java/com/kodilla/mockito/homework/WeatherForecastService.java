package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherForecastService {

    private Map<ServiceSubscriber, List<Location>> serviceSubscribers = new HashMap<>();

    public void addServiceSubscriber (ServiceSubscriber serviceSubscriber, List<Location> subscriberLocations) {
        this.serviceSubscribers.put(serviceSubscriber, subscriberLocations);
    }

    public void sendPersonalNotification(WeatherServiceNotification weatherServiceNotification, Location location) {
        for (Map.Entry<ServiceSubscriber, List<Location>> record : serviceSubscribers.entrySet()) {
            List<Location> subscriberLocationList = record.getValue();
            for (Location subscriberLocation : subscriberLocationList) {
                if (subscriberLocation.equals(location)) {record.getKey().receive(weatherServiceNotification);
                }
            }
        }
    }

    public void sendForAllNotification(WeatherServiceNotification weatherServiceNotification) {
        for (Map.Entry<ServiceSubscriber, List<Location>> record : serviceSubscribers.entrySet()) {
            {record.getKey().receive(weatherServiceNotification);
                }
            }
    }

    public void removeSubscription (ServiceSubscriber serviceSubscriber, Location location) {
        for (Map.Entry<ServiceSubscriber, List<Location>> record : serviceSubscribers.entrySet()) {
            if (record.getKey().equals(serviceSubscriber)) {
                List<Location> subscriberLocationList = record.getValue();
                subscriberLocationList.remove(location);
            }
        }
    }

    public void removeServiceSubscriber (ServiceSubscriber serviceSubscriber) {
        for (Map.Entry<ServiceSubscriber, List<Location>> record : serviceSubscribers.entrySet()) {
                this.serviceSubscribers.remove(serviceSubscriber);
        }
    }

    public void removeLocation (Location location) {
        for (Map.Entry<ServiceSubscriber, List<Location>> record : serviceSubscribers.entrySet()){
            List<Location> subscriberLocationList = record.getValue();
            subscriberLocationList.remove(location);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherForecastService)) return false;
        WeatherForecastService that = (WeatherForecastService) o;
        return serviceSubscribers.equals(that.serviceSubscribers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceSubscribers);
    }
}
