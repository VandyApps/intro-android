place picker
=============

## startActivityForResult
- starts another activity with an intent, other activity "returns" intent
- call `startActivityForResult` to do this with explicit or implicit intent
- override `onActivityResult` to receive result

## google place picker
- uses places api
- use an api key i made: `AIzaSyBGd38Atou3a6zFzLWkYIWKp-e_uqean0Q`
    - please don't use this to spam the service
- opens separate activity to pick location, returns to calling activity

## today
- **USE AN EMULATOR RUNNING API 24!!!**
- open place picker in a separate activity and display the result on the screen!
- you can start off with the code in [start](start/)
- my finished version will be available in [end](end/) after the class is finished

## result
![the app in use](app.gif)
