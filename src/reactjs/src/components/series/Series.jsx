import React from 'react';

import Card from 'react-bootstrap/Card';

import '../../assets/css/Card.css';

import defaultImage from '../../assets/images/defaultImage.png'

const Series = () => {
    return (
        <div>
          <Card className='content-card border-0'>
            <a href='#'>
              <Card.Img src={defaultImage} alt='Series' />
              <Card.Body>
                <Card.Title>Some series</Card.Title>
              </Card.Body>
            </a>
          </Card>
        </div>
    );
}

export default Series;
