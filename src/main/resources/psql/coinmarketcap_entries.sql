/*
 Navicat Premium Data Transfer

 Source Server         : Local Postgresql
 Source Server Type    : PostgreSQL
 Source Server Version : 90603
 Source Host           : localhost
 Source Database       : foogame
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 90603
 File Encoding         : utf-8

 Date: 02/26/2018 17:02:19 PM
*/

-- ----------------------------
--  Table structure for "coinmarketcap_entries"
-- ----------------------------
DROP TABLE IF EXISTS "coinmarketcap_entries";
CREATE TABLE "coinmarketcap_entries" (
  "id" SERIAL,
  "name" varchar(50),
  "symbol" varchar(5),
  "rank" int4,
  "price_usd" float8,
  "price_btc" float8,
  "daily_volume_usd" float8,
  "market_cap_usd" float8,
  "available_supply" float8,
  "total_supply" float8,
  "max_supply" float8,
  "hour_percent_change" float4,
  "day_percent_change" float4,
  "week_percent_change" float4,
  "last_updated" varchar(50)
)
WITH (OIDS=FALSE);
ALTER TABLE "coinmarketcap_entries" OWNER TO "postgres";

-- ----------------------------
--  Primary key structure for table "coinmarketcap_entries"
-- ----------------------------
ALTER TABLE "coinmarketcap_entries" ADD CONSTRAINT "coinmarketcap_entries_pkey" PRIMARY KEY ("id") NOT DEFERRABLE INITIALLY IMMEDIATE;

