--소스DB
CREATE TABLE EAI.MIG_TEST (
    A NVARCHAR2(10),
    B NVARCHAR2(10),
    C NVARCHAR2(10)
);

INSERT INTO EAI.MIG_TEST (A,B,C)
VALUES ('1', '2', '3');


--타겟DB
CREATE TABLE EAI.MIG_TEST (
    A NVARCHAR2(10),
    B NVARCHAR2(10)
);