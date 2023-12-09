// Get the list of sub-devices under the gateway
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
BatchDevices batchDevices = client.gatewaySubList(devIds);

System.out.println("Get device details in batches: ");
System.out.println(JSONObject.toJSONString(batchDevices));
