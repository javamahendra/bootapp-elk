# bootapp-elk



https://ipnet.xyz/2025/06/deploying-elk-stack-with-docker-compose-2025-edition/


allow creating roles

curl -X POST http://localhost:9200/_security/role/kibana_system_access -u elastic:mypassw0rd! -H "Content-Type: application/json" -d "{\"cluster\": [\"all\"], \"indices\": [{\"names\": [\".kibana*\", \".apm*\"], \"privileges\": [\"all\"], \"allow_restricted_indices\": true}]}"

creating roles

curl -X POST http://localhost:9200/_security/user/myadmin -u elastic:mypassw0rd! -H "Content-Type: application/json" -d "{\"password\":\"mypassw0rd!\",\"roles\":[\"superuser\",\"kibana_system_access\"],\"full_name\":\"Lab Admin\"}"


https://ipnet.xyz/2025/06/deploying-elk-stack-with-docker-compose-2025-edition/


