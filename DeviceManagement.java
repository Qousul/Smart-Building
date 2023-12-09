// Get device details
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
DeviceVo deviceVo = client.getDeviceInfo(DEV_ID);
System.out.println("Get device details: ");
System.out.println(JSONObject.toJSONString(deviceVo));

// Get a list of devices under a specified user
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
List<DeviceVo> deviceFunctions = client.getUserDevices(UID);
System.out.println("Get a list of devices under a specified user: ");
System.out.println(JSONObject.toJSONString(deviceFunctions));

// Get a list of devices
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
BatchDevices batchDevices = client.getDeviceListInfo(devIds);
System.out.println("Get device details in bulk: ");
System.out.println(JSONObject.toJSONString(batchDevices));
