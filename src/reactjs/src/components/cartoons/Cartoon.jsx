import React from 'react';

import defaultImage from '../../assets/images/defaultImage.png';

import Card from 'react-bootstrap/Card';
import '../../assets/css/Card.css';

const Cartoon = () => {
    return (
        <div>
          <Card className='content-card border-0'>
            <a href=''>
              <Card.Img src={defaultImage} />
              <Card.Body>
                <Card.Title>Some Cartoon</Card.Title>
              </Card.Body>
            </a>
          </Card>
        </div>
    );
}

export default Cartoon;
