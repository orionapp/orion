const path = require('path');
const express = require('../../build/node_modules/express/index.js');
const port = process.env.PORT || 5000;
const app = express();
app.use('/static', express.static(path.join(__dirname, '../../../assets')));
app.use('/build', express.static(path.join(__dirname, '../../build/bundle')));

// Send the user to index html page in spite of the url.
app.get('*', (req, res) => {
    res.sendFile(path.join(__dirname, '../../build/bundle/index.html'), function (err) {
        if (err) {
            res.status(500).send(err);
        }
    });
});

// Start listening.
app.listen(port, () => console.log(`Listening on port ${port}...`));
