# tantalum-messages-rest
This project comes as a test received on an interview.

Requirements:

- production ready code
- one micro service exposing REST API to allow:
  - adding messages
  - editing message but only within 10 seconds after the message is created
  - returns messages (one endpoint to return all of them and one to get x number last messages)
  - deleting message but only if it's older than 2 minutes
  - persists messages in in-memory database

Additional (optional for junior devs) requirements for mid and snr devs
- second micro service which is used to generate UUIDs for new messages
- one endpoint GET /message-uuid which returns {prefix}-UUID-{suffix} - both prefix and suffix configurable
- first micro service (REST) is finding second one by usage of service discovery
- both micro services are configured using consul
- clear instructions how to run these services either as standalone apps on a local machine or using docker compose
- instructions how consul should be configured



Running the application on Windows:

-download consul from https://releases.hashicorp.com/consul/1.3.0/
-run this command on cmd: consul agent -dev -bind=127.0.0.1