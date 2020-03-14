package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class WeatherForecastServiceTestSuite {

    WeatherForecastService weatherForecastService = new WeatherForecastService();
    ServiceSubscriber serviceSubscriber = Mockito.mock(ServiceSubscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    WeatherServiceNotification weatherForecastServiceNotification = Mockito.mock(WeatherServiceNotification.class);

    @Test
    public void personCanSubscribeNotificationForGivenLocationAndStartReceiveNotifications(){
        List<Location> subscriberLocations = new ArrayList<>();
        subscriberLocations.add(location1);
        subscriberLocations.add(location2);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location1);
        Mockito.verify(serviceSubscriber, Mockito.times(1)).receive(weatherForecastServiceNotification);
    }

    @Test
    public void subscriberShouldNotReceiveNotificationForUnsubscribedLocation(){
        List<Location> subscriberLocations = new ArrayList<>();
        subscriberLocations.add(location1);
        subscriberLocations.add(location2);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.removeSubscription(serviceSubscriber,location2);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location2);
        Mockito.verify(serviceSubscriber, Mockito.times(0)).receive(weatherForecastServiceNotification);
    }

    @Test
    public void unsubscribedFromServiceShouldNotReceiveNotification() {
        List<Location> subscriberLocations = new ArrayList<>();
        subscriberLocations.add(location1);
        subscriberLocations.add(location2);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.removeServiceSubscriber(serviceSubscriber);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location2);
        Mockito.verify(serviceSubscriber, Mockito.times(0)).receive(weatherForecastServiceNotification);
    }

    @Test
    public void notificationForLocationShouldBeSentOnlyForPersonSubscribedIt() {
        ServiceSubscriber serviceSubscriber2 = Mockito.mock(ServiceSubscriber.class);
        ServiceSubscriber serviceSubscriber3 = Mockito.mock(ServiceSubscriber.class);
        List<Location> subscriberLocations = new ArrayList<>();
        List<Location> subscriber2Locations = new ArrayList<>();
        List<Location> subscriber3Locations = new ArrayList<>();
        subscriberLocations.add(location1);
        subscriberLocations.add(location2);
        subscriber2Locations.add(location1);
        subscriber2Locations.add(location3);
        subscriber3Locations.add(location3);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber2, subscriber2Locations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber3, subscriber3Locations);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location1);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location2);
        Mockito.verify(serviceSubscriber, Mockito.times(2)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber2, Mockito.times(1)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber3, Mockito.times(0)).receive(weatherForecastServiceNotification);
    }

    @Test
    public void eachSubscribersShouldReceiveNotificationSentToAll(){
        List<Location> subscriberLocations = new ArrayList<>();
        List<Location> subscriber2Locations = new ArrayList<>();
        List<Location> subscriber3Locations = new ArrayList<>();
        ServiceSubscriber serviceSubscriber2 = Mockito.mock(ServiceSubscriber.class);
        ServiceSubscriber serviceSubscriber3 = Mockito.mock(ServiceSubscriber.class);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber2, subscriber2Locations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber3, subscriber3Locations);
        weatherForecastService.sendForAllNotification(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber, Mockito.times(1)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber2, Mockito.times(1)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber3, Mockito.times(1)).receive(weatherForecastServiceNotification);
    }

    @Test
    public void notificationShouldNotBeSentForDeletedLocation(){
        List<Location> subscriberLocations = new ArrayList<>();
        List<Location> subscriber2Locations = new ArrayList<>();
        List<Location> subscriber3Locations = new ArrayList<>();
        ServiceSubscriber serviceSubscriber2 = Mockito.mock(ServiceSubscriber.class);
        ServiceSubscriber serviceSubscriber3 = Mockito.mock(ServiceSubscriber.class);
        subscriberLocations.add(location1);
        subscriberLocations.add(location2);
        subscriber2Locations.add(location1);
        subscriber2Locations.add(location3);
        subscriber3Locations.add(location2);
        subscriber3Locations.add(location3);
        weatherForecastService.addServiceSubscriber(serviceSubscriber, subscriberLocations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber2, subscriber2Locations);
        weatherForecastService.addServiceSubscriber(serviceSubscriber3, subscriber3Locations);
        weatherForecastService.removeLocation(location2);
        weatherForecastService.sendPersonalNotification(weatherForecastServiceNotification, location2);
        Mockito.verify(serviceSubscriber, Mockito.times(0)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber2, Mockito.times(0)).receive(weatherForecastServiceNotification);
        Mockito.verify(serviceSubscriber3, Mockito.times(0)).receive(weatherForecastServiceNotification);


    }
}