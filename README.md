proJMS - Messaging Library for the Processing environment

proJMS is a library for Processing that allows the easy usage of JMS. It allows publish and consume JMS messages and to create peer to peer communication between processing applications in a network.

proJMS integrates the Apache ActiveMQ into your processing application, currently using ActiveMQ 5.6.0.

The main idea of this library is to allow processing users to easily integrate JMS infrastructure into a processing application. For the ease of use in this first version, only text messages can be send and received. More JMS feature will be added later and/or on request.

proJMS has been sucessfully used for transmitting GML documents between bombIR 2.0 applications in Berlin, Vancouver and Seoul during the PWN THE WALL event, october 2012. proJMS has been tested on Windows7 and Mac OSX with processing 1.5.1 and 2.0.

See the github wiki for installation and usage instructions:

https://github.com/tugelbend/projms/wiki

Please let us know if you've got problems running proJMS so I can fix bugs or clarify documentation if needed.

Security advice: proJMS message content is not secured or encrypted by default due to the fact that usually processing applications won't exchange sensitiv information with each other. If you want to use proJMS for something like that you'll need to use the ActiveMQ SSL transport protocol. Please refer to the ActiveMQ SSL transport reference for that. However, we think this goes far beyond the purpose of this little library.

Credits: proJMS has been developed by Hauke Altmann in collaboration with Jesse Scott, Semiramis Ceylan and Mirae Rosner. 
