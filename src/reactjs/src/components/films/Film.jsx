import React from 'react';

import Card from 'react-bootstrap/Card';

import '../../assets/css/films/Film.css';

import defaultImage from '../../assets/images/defaultImage.png';

const Film = props => {
    const {imageSrc} = props;

    return (
        <div>
          <Card className='film-card content-card border-0'>
            <a href='#'>
              <Card.Img src={imageSrc || defaultImage} alt='Film'/>
              <Card.Body>
                <Card.Title>Some film</Card.Title>
              </Card.Body>
            </a>
          </Card>
        </div>
    );
}

export default Film;
