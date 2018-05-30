

@tag
Feature: Title of your feature
	I want to create and delete a workflow on tray

@tag1
Scenario: Title of your scenario
Given I Login to Tray.io
And I Create a new Workflow
When I Go back to Dashboard
And Delete the previously created Workflow
Then Log out of Tray.io
