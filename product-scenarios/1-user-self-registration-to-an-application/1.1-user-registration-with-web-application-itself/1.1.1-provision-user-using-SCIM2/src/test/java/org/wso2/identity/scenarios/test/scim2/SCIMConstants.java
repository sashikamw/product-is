package org.wso2.identity.scenarios.test.scim2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SCIMConstants {

    public static final String SCIM2_USERS_ENDPOINT = "/scim2/Users";
    public static final String SCIM2_BULK_USERS_ENDPOINT = "/scim2/Bulk";
    public static final String SCHEMAS_ATTRIBUTE = "schemas";
    public static final String GIVEN_NAME_ATTRIBUTE = "givenName";
    public static final String FAMILY_NAME_ATTRIBUTE = "familyName";
    public static final String EMAILS_ATTRIBUTE = "emails";
    public static final String EMAIL_TYPE_WORK_ATTRIBUTE = "work";
    public static final String EMAIL_TYPE_HOME_ATTRIBUTE = "home";
    public static final String TYPE_PARAM = "type";
    public static final String VALUE_PARAM = "value";
    public static final String PRIMARY_PARAM = "primary";
    public static final String NAME_ATTRIBUTE = "name";
    public static final String USER_NAME_ATTRIBUTE = "userName";
    public static final String PATH_PARM = "/Users";
    public static final String PATH_ATTRIBUTE = "path";
    public static final String METHOD_PARM = "POST";
    public static final String METHOD_ATTRIBUTE = "method";
    public static final String FAIL_ON_ERROR_ATTRIBUTE = "failOnErrors";
    public static final String BULK_ATTRIBUTE = "bulkId";
    public static final String PASSWORD_ATTRIBUTE = "password";
    public static final String ID_ATTRIBUTE = "id";
    public static final String GIVEN_NAME_CLAIM_VALUE = "user2";
    public static final String FAMILY_NAME_CLAIM_VALUE = "scim2";
    public static final String USERNAME = "scim2user";
    public static final String PASSWORD = "scim2pwd";
    public static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";
    public static final String ERROR_SCHEMA = "urn:ietf:params:scim:api:messages:2.0:Error";
    public static final String BULK_SCHEMA = "urn:ietf:params:scim:api:messages:2.0:BulkRequest";
    public static final String USER_SCHEMA = "urn:ietf:params:scim:schemas:core:2.0:User";


    public void scimEnterpriseattributes(){
    String a = "test";
    }

    public void scimBulkOperationattributes(){

        JSONArray operations = new JSONArray();

        JSONArray schemaUser = new JSONArray();
        schemaUser.add("urn:ietf:params:scim:schemas:core:2.0:User");

        JSONObject data1 = new JSONObject();
        data1.put("schemas",schemaUser);
        data1.put("userName","Kris90");
        data1.put("password","password");

        JSONObject bulkuser1 = new JSONObject();
        bulkuser1.put("method","POST");
        bulkuser1.put("path","/Users");
        bulkuser1.put("bulkId","qwerty");
        bulkuser1.put("data", data1);

        bulkuser1.put("data", data1);

        operations.add(bulkuser1);

        System.out.print(operations);

        return;

/*        return operations;*/

    }


}
