package ru.teacher.it_fest_2022_demo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseData {
}

class Address {

    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("formatted")
    @Expose
    private String formatted;
    @SerializedName("Components")
    @Expose
    private ArrayList<Component> components = null;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

}

class AddressDetails {

    @SerializedName("Country")
    @Expose
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}

class AdministrativeArea {

    @SerializedName("AdministrativeAreaName")
    @Expose
    private String administrativeAreaName;
    @SerializedName("Locality")
    @Expose
    private Locality locality;

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

}

class BoundedBy {

    @SerializedName("Envelope")
    @Expose
    private Envelope envelope;

    public Envelope getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope envelope) {
        this.envelope = envelope;
    }

}

class Component {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("name")
    @Expose
    private String name;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Country {

    @SerializedName("AddressLine")
    @Expose
    private String addressLine;
    @SerializedName("CountryNameCode")
    @Expose
    private String countryNameCode;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("AdministrativeArea")
    @Expose
    private AdministrativeArea administrativeArea;

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCountryNameCode() {
        return countryNameCode;
    }

    public void setCountryNameCode(String countryNameCode) {
        this.countryNameCode = countryNameCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

}

class Envelope {

    @SerializedName("lowerCorner")
    @Expose
    private String lowerCorner;
    @SerializedName("upperCorner")
    @Expose
    private String upperCorner;

    public String getLowerCorner() {
        return lowerCorner;
    }

    public void setLowerCorner(String lowerCorner) {
        this.lowerCorner = lowerCorner;
    }

    public String getUpperCorner() {
        return upperCorner;
    }

    public void setUpperCorner(String upperCorner) {
        this.upperCorner = upperCorner;
    }

}

class Example {

    @SerializedName("response")
    @Expose
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}

class FeatureMember {

    @SerializedName("GeoObject")
    @Expose
    private GeoObject geoObject;

    public GeoObject getGeoObject() {
        return geoObject;
    }

    public void setGeoObject(GeoObject geoObject) {
        this.geoObject = geoObject;
    }

}

class GeoObject {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty__1 metaDataProperty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy boundedBy;
    @SerializedName("Point")
    @Expose
    private Point point;

    public MetaDataProperty__1 getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty__1 metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoundedBy getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy boundedBy) {
        this.boundedBy = boundedBy;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

}

class GeoObjectCollection {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty metaDataProperty;
    @SerializedName("featureMember")
    @Expose
    private ArrayList<FeatureMember> featureMember = null;

    public MetaDataProperty getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public ArrayList<FeatureMember> getFeatureMember() {
        return featureMember;
    }

    public void setFeatureMember(ArrayList<FeatureMember> featureMember) {
        this.featureMember = featureMember;
    }

}

class GeocoderMetaData {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("AddressDetails")
    @Expose
    private AddressDetails addressDetails;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

}

class GeocoderResponseMetaData {

    @SerializedName("request")
    @Expose
    private String request;
    @SerializedName("found")
    @Expose
    private String found;
    @SerializedName("results")
    @Expose
    private String results;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

}

class Locality {

    @SerializedName("LocalityName")
    @Expose
    private String localityName;
    @SerializedName("Thoroughfare")
    @Expose
    private Thoroughfare thoroughfare;

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public Thoroughfare getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(Thoroughfare thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

}

class MetaDataProperty {

    @SerializedName("GeocoderResponseMetaData")
    @Expose
    private GeocoderResponseMetaData geocoderResponseMetaData;

    public GeocoderResponseMetaData getGeocoderResponseMetaData() {
        return geocoderResponseMetaData;
    }

    public void setGeocoderResponseMetaData(GeocoderResponseMetaData geocoderResponseMetaData) {
        this.geocoderResponseMetaData = geocoderResponseMetaData;
    }

}

class MetaDataProperty__1 {

    @SerializedName("GeocoderMetaData")
    @Expose
    private GeocoderMetaData geocoderMetaData;

    public GeocoderMetaData getGeocoderMetaData() {
        return geocoderMetaData;
    }

    public void setGeocoderMetaData(GeocoderMetaData geocoderMetaData) {
        this.geocoderMetaData = geocoderMetaData;
    }

}

class Point {

    @SerializedName("pos")
    @Expose
    private String pos;

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

}

class PostalCode {

    @SerializedName("PostalCodeNumber")
    @Expose
    private String postalCodeNumber;

    public String getPostalCodeNumber() {
        return postalCodeNumber;
    }

    public void setPostalCodeNumber(String postalCodeNumber) {
        this.postalCodeNumber = postalCodeNumber;
    }

}

class Premise {

    @SerializedName("PremiseNumber")
    @Expose
    private String premiseNumber;
    @SerializedName("PostalCode")
    @Expose
    private PostalCode postalCode;

    public String getPremiseNumber() {
        return premiseNumber;
    }

    public void setPremiseNumber(String premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

}

class Response {

    @SerializedName("GeoObjectCollection")
    @Expose
    private GeoObjectCollection geoObjectCollection;

    public GeoObjectCollection getGeoObjectCollection() {
        return geoObjectCollection;
    }

    public void setGeoObjectCollection(GeoObjectCollection geoObjectCollection) {
        this.geoObjectCollection = geoObjectCollection;
    }

}

class Thoroughfare {

    @SerializedName("ThoroughfareName")
    @Expose
    private String thoroughfareName;
    @SerializedName("Premise")
    @Expose
    private Premise premise;

    public String getThoroughfareName() {
        return thoroughfareName;
    }

    public void setThoroughfareName(String thoroughfareName) {
        this.thoroughfareName = thoroughfareName;
    }

    public Premise getPremise() {
        return premise;
    }

    public void setPremise(Premise premise) {
        this.premise = premise;
    }

}
