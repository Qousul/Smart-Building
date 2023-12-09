// Get the instruction set by category
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
CategoryFunctions categoryFunctions = client.getFunctionByCategory("kg");
System.out.println("Get the function list by category: ");
System.out.println(JSONObject.toJSONString(categoryFunctions));

// Get the instruction set by device
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
categoryFunctions = client.getFunctionsByDevId(DEV_ID);
System.out.println("Get the function list by device ID: ");
System.out.println(JSONObject.toJSONString(categoryFunctions));

// Get the instruction set by devices
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
categoryFunctions = client.getFunctionsByDevsList(DEV_ID);
System.out.println("Get the function list by devices List: ");
System.out.println(JSONObject.toJSONString(categoryFunctions));

// Send instructions to the device
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
JSONObject temp = new JSONObject();
temp.put("v", 0);
temp.put("s", 1);
temp.put("h", 1);
Command command = new Command("colour_data", temp);
List<Command> list = new ArrayList<Command>(1);
list.add(command);
Boolean isSuccess = client.postDeviceCommand("vdevo155013689282523", list);
System.out.println("Send device control instructions: ");
System.out.println(isSuccess);

// Get the latest device status
TuyaClient client = new TuyaClient(clientId, secret, RegionEnum.CN);
List<Status> deviceStatus= client.getDeviceStatus(DEV_ID);
System.out.println("Get device status: ");
System.out.println(JSONObject.toJSONString(deviceStatus));
