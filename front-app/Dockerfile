FROM node:latest

LABEL authors="Ayoub Marghad"

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

EXPOSE 4200

CMD ["npm", "start"]